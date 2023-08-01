package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}