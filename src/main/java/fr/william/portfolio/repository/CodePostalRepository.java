package fr.william.portfolio.repository;

import fr.william.portfolio.entity.CodePostal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodePostalRepository extends JpaRepository<CodePostal, Long> {
}