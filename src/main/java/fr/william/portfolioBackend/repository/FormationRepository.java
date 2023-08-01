package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}