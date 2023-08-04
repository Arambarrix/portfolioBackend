package fr.william.portfolio.dto;

import fr.william.portfolio.entity.TypeRue;
import lombok.Data;

@Data
public class AdresseDTO {
    private Long id;
    private NomRueDTO nomRue;
    private Integer numero;
    private TypeRue typeRue;
    private CodePostalDTO codePostal;
}
