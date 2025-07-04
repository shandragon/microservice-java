package br.edu.cerqueira.adailton.microservices.card.service;

import br.edu.cerqueira.adailton.microservices.card.convert.DTOConvert;
import br.edu.cerqueira.adailton.microservices.dto.CardDTO;
import br.edu.cerqueira.adailton.microservices.card.model.Card;
import br.edu.cerqueira.adailton.microservices.card.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CardService {
    @Autowired
    private CardRepository repository;

    public List<CardDTO> getAll() {
        List<Card> cards = repository.findAll();
        return cards.stream().map(DTOConvert::convert).collect(Collectors.toList());
    }

    public CardDTO findById(long cardId) {
        Optional<Card> card = repository.findById(cardId);
        if (card.isPresent()) {
            return DTOConvert.convert(card.get());
        }
        return null;
    }

    public CardDTO save(CardDTO cardDTO) {
        Card card = repository.save(Card.convert(cardDTO));
        return DTOConvert.convert(card);
    }

    public CardDTO delete(long cardId) {
        Optional<Card> card = repository.findById(cardId);
        if (card.isPresent()) {
            repository.delete(card.get());
        }
        return null;
    }

    public List<CardDTO> queryByName(String name) {
        List<Card> cards = repository.queryByNameLike(name);
        return cards.stream().map(DTOConvert::convert).collect(Collectors.toList());
    }
}
