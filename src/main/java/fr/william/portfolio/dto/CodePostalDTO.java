package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Localite;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CodePostalDTO {
    private Long id;
    private Localite localite;
    private Integer numero;
}
