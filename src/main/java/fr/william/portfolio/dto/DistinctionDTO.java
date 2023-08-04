package fr.william.portfolio.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DistinctionDTO {
    private Long id;
    private String description;
    private Date dateObtention;
    private RessourceDTO ressource;
    private RealisationDTO realisation;
}
