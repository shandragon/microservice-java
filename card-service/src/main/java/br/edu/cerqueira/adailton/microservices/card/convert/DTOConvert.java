package br.edu.cerqueira.adailton.microservices.card.convert;

import br.edu.cerqueira.adailton.microservices.card.model.Category;
import br.edu.cerqueira.adailton.microservices.dto.CategoryDTO;

public class DTOConvert {
    public static CategoryDTO convert(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        return categoryDTO;
    }
}
