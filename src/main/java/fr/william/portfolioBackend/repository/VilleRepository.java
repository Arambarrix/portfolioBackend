package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville, Long> {
}