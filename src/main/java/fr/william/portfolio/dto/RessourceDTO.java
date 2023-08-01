package fr.william.portfolio.dto;

import fr.william.portfolio.entity.TypeRessource;
import lombok.Data;

@Data
public class RessourceDTO {
    private Long id;
    private String description;
    private TypeRessource type;
    private byte[] fichier;
}
