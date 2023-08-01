package fr.william.portfolio.dto;

import lombok.Data;

@Data
public class LocaliteDTO {
    private Long id;
    private String nom;
    private VilleDTO villeDTO;
}
