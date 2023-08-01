package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}