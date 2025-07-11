package br.edu.cerqueira.adailton.microservices.card.controller;

import br.edu.cerqueira.adailton.microservices.card.service.CategoryService;
import br.edu.cerqueira.adailton.microservices.dto.CategoryDTO;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PermitAll
    @GetMapping("/category")
    public List<CategoryDTO> getAll() {
        return service.getAll();
    }
}
