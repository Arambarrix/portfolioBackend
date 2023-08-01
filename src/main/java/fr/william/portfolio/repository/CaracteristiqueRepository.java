package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Caracteristique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaracteristiqueRepository extends JpaRepository<Caracteristique, Long> {
}