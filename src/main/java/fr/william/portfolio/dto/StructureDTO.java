package fr.william.portfolio.dto;

import fr.william.portfolio.entity.TypeStructure;
import lombok.Data;

@Data
public class StructureDTO {
    private Long id;
    private String nom;
    private TypeStructure typeStructure;
    private AdresseDTO adresse;
}
