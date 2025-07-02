package br.edu.cerqueira.adailton.microservices.card.repository;

import br.edu.cerqueira.adailton.microservices.card.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> queryByNameLike(String name);
}
