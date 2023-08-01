package fr.william.portfolio.dto;

import fr.william.portfolio.entity.CodePostal;
import fr.william.portfolio.entity.NomRue;
import fr.william.portfolio.entity.TypeRue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class AdresseDTO {
    private Long id;
    private NomRueDTO nomRueDTO;
    private Integer numero;
    private TypeRue typeRue;
    private CodePostal codePostal;
}
