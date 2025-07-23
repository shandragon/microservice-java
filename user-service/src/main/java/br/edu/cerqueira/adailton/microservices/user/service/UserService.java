package br.edu.cerqueira.adailton.microservices.user.service;

import br.edu.cerqueira.adailton.microservices.dto.UserDTO;
import br.edu.cerqueira.adailton.microservices.user.convert.DTOConvert;
import br.edu.cerqueira.adailton.microservices.user.model.User;
import br.edu.cerqueira.adailton.microservices.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    public UserDTO getProfile(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UUID userId = UUID.fromString(authentication.getName());

        Optional<User> user = repository.findById(userId);
        if (user.isPresent()) {
            log.debug("User found: {}", user.get().getName());
            return DTOConvert.convert(user.get());
        }
        log.info("User not found with ID: {}", userId);

        Jwt principal = (Jwt) authentication.getPrincipal();

        User newUser = new User();
        newUser.setId(userId);
        newUser.setName(principal.getClaimAsString("name"));
        newUser.setEmail(principal.getClaimAsString("email"));
        newUser.setCpf(principal.getClaimAsString("cpf"));
        newUser.setCreatedAt(new Date());
        newUser.setUpdatedAt(new Date());
        return DTOConvert.convert(repository.save(newUser));
    }

    public List<UserDTO> getAll() {
        List<User> users = repository.findAll();
        return users.stream().map(DTOConvert::convert).collect(Collectors.toList());
    }

    public UserDTO findById(String userId) {
        Optional<User> user = repository.findById(UUID.fromString(userId));
        if (user.isPresent()) {
            return DTOConvert.convert(user.get());
        }
        return null;
    }

    public UserDTO findByCpf(String cpf) {
        User user = repository.findByCpf(cpf);
        if (user != null) {
            return DTOConvert.convert(user);
        }
        return null;
    }

    public List<UserDTO> queryByName(String name) {
        List<User> users = repository.queryByNameLike(name);
        return users.stream().map(DTOConvert::convert).collect(Collectors.toList());
    }
}
