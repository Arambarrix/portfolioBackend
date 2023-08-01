package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}