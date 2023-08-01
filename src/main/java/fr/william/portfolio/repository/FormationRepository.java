package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}