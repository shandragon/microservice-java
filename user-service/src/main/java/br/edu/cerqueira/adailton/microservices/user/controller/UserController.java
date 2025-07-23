package br.edu.cerqueira.adailton.microservices.user.controller;

import br.edu.cerqueira.adailton.microservices.dto.UserDTO;
import br.edu.cerqueira.adailton.microservices.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    UserDTO show(@PathVariable String id) {
        return service.findById(id);
    }

    @GetMapping("/cpf/{cpf}")
    UserDTO showByCpf(@PathVariable String cpf) {
        return service.findByCpf(cpf);
    }

    @GetMapping("/search")
    public List<UserDTO> search(
            @RequestParam(name="nome", required = true)
            String nome) {
        return service.queryByName(nome);
    }

    @GetMapping("/profile")
    public UserDTO profile() {
        return service.getProfile();
    }
}
