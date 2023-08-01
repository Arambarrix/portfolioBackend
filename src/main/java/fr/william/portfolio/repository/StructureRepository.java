package fr.william.portfolio.repository;

import fr.william.portfolio.entity.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StructureRepository extends JpaRepository<Structure, Long> {
}