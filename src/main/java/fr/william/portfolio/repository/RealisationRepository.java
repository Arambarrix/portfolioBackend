package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Realisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealisationRepository extends JpaRepository<Realisation, Long> {
}