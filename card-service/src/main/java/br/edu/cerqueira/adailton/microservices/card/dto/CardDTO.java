package br.edu.cerqueira.adailton.microservices.card.dto;

import br.edu.cerqueira.adailton.microservices.card.convert.DTOConvert;
import br.edu.cerqueira.adailton.microservices.card.model.Card;
import br.edu.cerqueira.adailton.microservices.dto.CategoryDTO;

import java.util.Date;

public class CardDTO {
    private String name;
    private Date createdAt;
    private CategoryDTO category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public static CardDTO convert(Card card) {
        CardDTO cardDTO = new CardDTO();
        cardDTO.setName(card.getName());
        cardDTO.setCreatedAt(card.getCreatedAt());
        cardDTO.setCategory(DTOConvert.convert(card.getCategory()));
        return cardDTO;
    }
}
