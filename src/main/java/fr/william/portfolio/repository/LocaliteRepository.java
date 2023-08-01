package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Localite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocaliteRepository extends JpaRepository<Localite, Long> {
}