package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville, Long> {
}