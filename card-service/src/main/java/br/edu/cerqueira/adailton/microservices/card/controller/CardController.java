package br.edu.cerqueira.adailton.microservices.card.controller;

import br.edu.cerqueira.adailton.microservices.dto.CardDTO;
import br.edu.cerqueira.adailton.microservices.card.service.CardService;
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
public class CardController {
    @Autowired
    private CardService service;

    @GetMapping("/card")
    public List<CardDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/card/{id}")
    CardDTO show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/card")
    CardDTO create(@RequestBody CardDTO cardDTO) {
        return service.save(cardDTO);
    }

    @DeleteMapping("/card/{id}")
    CardDTO delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @GetMapping("/card/search")
    public List<CardDTO> search(
            @RequestParam(name="nome", required = true)
            String nome) {
        return service.queryByName(nome);
    }
}
