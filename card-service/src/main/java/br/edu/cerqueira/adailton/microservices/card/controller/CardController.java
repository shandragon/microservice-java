package br.edu.cerqueira.adailton.microservices.card.controller;

import br.edu.cerqueira.adailton.microservices.dto.CardDTO;
import br.edu.cerqueira.adailton.microservices.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardService service;

    @GetMapping("")
    public List<CardDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    CardDTO show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("")
    CardDTO create(@RequestBody CardDTO cardDTO) {
        return service.save(cardDTO);
    }

    @DeleteMapping("/{id}")
    CardDTO delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @GetMapping("/search")
    public List<CardDTO> search(
            @RequestParam(name="nome", required = true)
            String nome) {
        return service.queryByName(nome);
    }
}
