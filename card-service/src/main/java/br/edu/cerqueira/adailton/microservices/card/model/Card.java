package br.edu.cerqueira.adailton.microservices.card.model;

import br.edu.cerqueira.adailton.microservices.card.dto.CardDTO;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static Card convert(CardDTO userDTO) {
        Card card = new Card();
        card.setName(userDTO.getName());
        card.setCreatedAt(userDTO.getCreatedAt());
        return card;
    }
}
