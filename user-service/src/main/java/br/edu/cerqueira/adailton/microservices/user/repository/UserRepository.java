package br.edu.cerqueira.adailton.microservices.user.repository;

import br.edu.cerqueira.adailton.microservices.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByCpf(String cpf);
    List<User> queryByNameLike(String name);
}
