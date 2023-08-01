package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Distinction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistinctionRepository extends JpaRepository<Distinction, Long> {
}