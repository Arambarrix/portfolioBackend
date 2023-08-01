package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays, Long> {
}