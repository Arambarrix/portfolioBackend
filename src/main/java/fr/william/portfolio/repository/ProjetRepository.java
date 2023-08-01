package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}