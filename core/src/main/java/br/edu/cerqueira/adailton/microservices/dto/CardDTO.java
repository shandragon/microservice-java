package br.edu.cerqueira.adailton.microservices.dto;

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
}
