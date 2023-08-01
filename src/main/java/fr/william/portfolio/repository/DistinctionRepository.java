package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Distinction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistinctionRepository extends JpaRepository<Distinction, Long> {
}