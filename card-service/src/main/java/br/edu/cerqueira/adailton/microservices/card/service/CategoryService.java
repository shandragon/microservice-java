package br.edu.cerqueira.adailton.microservices.card.service;

import br.edu.cerqueira.adailton.microservices.card.convert.DTOConvert;
import br.edu.cerqueira.adailton.microservices.card.model.Category;
import br.edu.cerqueira.adailton.microservices.card.repository.CategoryRepository;
import br.edu.cerqueira.adailton.microservices.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<CategoryDTO> getAll() {
        List<Category> cards = repository.findAll();
        return cards.stream().map(DTOConvert::convert).collect(Collectors.toList());
    }
}
