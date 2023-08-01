package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RessourceRepository extends JpaRepository<Ressource, Long> {
}