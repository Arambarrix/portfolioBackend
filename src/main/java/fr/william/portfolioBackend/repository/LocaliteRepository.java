package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Localite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocaliteRepository extends JpaRepository<Localite, Long> {
}