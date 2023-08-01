package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays, Long> {
}