package br.edu.cerqueira.adailton.microservices.usuario.controller;

import br.edu.cerqueira.adailton.microservices.usuario.dto.UserDTO;
import br.edu.cerqueira.adailton.microservices.usuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/user")
    public List<UserDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/user/{id}")
    UserDTO show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/user")
    UserDTO create(@RequestBody UserDTO userDTO) {
        return service.save(userDTO);
    }

    @GetMapping("/user/cpf/{cpf}")
    UserDTO showByCpf(@PathVariable String cpf) {
        return service.findByCpf(cpf);
    }

    @DeleteMapping("/user/{id}")
    UserDTO delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @GetMapping("/user/search")
    public List<UserDTO> search(
            @RequestParam(name="nome", required = true)
            String nome) {
        return service.queryByName(nome);
    }
}
