package br.edu.cerqueira.adailton.microservices.usuario.service;

import br.edu.cerqueira.adailton.microservices.usuario.dto.UserDTO;
import br.edu.cerqueira.adailton.microservices.usuario.model.User;
import br.edu.cerqueira.adailton.microservices.usuario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<UserDTO> getAll() {
        List<User> users = repository.findAll();
        return users.stream().map(UserDTO::convert).collect(Collectors.toList());
    }

    public UserDTO findById(long userId) {
        Optional<User> user = repository.findById(userId);
        if (user.isPresent()) {
            return UserDTO.convert(user.get());
        }
        return null;
    }

    public UserDTO save(UserDTO userDTO) {
        userDTO.setCreatedAt(new Date());
        User user = repository.save(User.convert(userDTO));
        return UserDTO.convert(user);
    }

    public UserDTO delete(long userId) {
        Optional<User> user = repository.findById(userId);
        if (user.isPresent()) {
            repository.delete(user.get());
        }
        return null;
    }

    public UserDTO findByCpf(String cpf) {
        User user = repository.findByCpf(cpf);
        if (user != null) {
            return UserDTO.convert(user);
        }
        return null;
    }

    public List<UserDTO> queryByName(String name) {
        List<User> users = repository.queryByNameLike(name);
        return users.stream().map(UserDTO::convert).collect(Collectors.toList());
    }
}
