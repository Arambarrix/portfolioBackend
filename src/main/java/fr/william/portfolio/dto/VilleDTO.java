package fr.william.portfolio.dto;

import lombok.Data;

@Data
public class VilleDTO {
    private Long id;
    private String nom;
    private PaysDTO paysDTO;
}
