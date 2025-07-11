package br.edu.cerqueira.adailton.microservices.usuario.controller;

import br.edu.cerqueira.adailton.microservices.usuario.dto.UserDTO;
import br.edu.cerqueira.adailton.microservices.usuario.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @GetMapping("/")
    public List<UserDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    UserDTO show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/")
    UserDTO create(@RequestBody UserDTO userDTO) {
        return service.save(userDTO);
    }

    @GetMapping("/cpf/{cpf}")
    UserDTO showByCpf(@PathVariable String cpf) {
        return service.findByCpf(cpf);
    }

    @DeleteMapping("/{id}")
    UserDTO delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @GetMapping("/search")
    public List<UserDTO> search(
            @RequestParam(name="nome", required = true)
            String nome) {
        return service.queryByName(nome);
    }

    @GetMapping("/ping")
    public String ping() {
        log.info("Ping request received");
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        String username = authentication.getName();
        String details = authentication.getDetails().toString();
        log.info("Authenticated user: " + username);
        log.info("User details: " + details);
        return "Scopes: " + authentication.getAuthorities();
    }
}
