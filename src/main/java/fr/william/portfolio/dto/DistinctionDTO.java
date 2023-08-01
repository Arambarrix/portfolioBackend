package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Realisation;
import fr.william.portfolio.entity.Ressource;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Data
public class DistinctionDTO {
    private Long id;
    private String description;
    private Date dateObtention;
    private Ressource ressource;
    private Realisation realisationDTO;
}
