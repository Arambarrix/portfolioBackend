package fr.william.portfolioBackend.repository;

import fr.william.portfolioBackend.entity.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StructureRepository extends JpaRepository<Structure, Long> {
}