package br.edu.cerqueira.adailton.microservices.card.repository;

import br.edu.cerqueira.adailton.microservices.card.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
