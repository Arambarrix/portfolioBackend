package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.CodePostal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodePostalRepository extends JpaRepository<CodePostal, Long> {
}