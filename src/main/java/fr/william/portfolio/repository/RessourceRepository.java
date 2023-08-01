package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RessourceRepository extends JpaRepository<Ressource, Long> {
}