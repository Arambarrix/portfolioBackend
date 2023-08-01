package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Caracteristique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaracteristiqueRepository extends JpaRepository<Caracteristique, Long> {
}