package fr.william.portfolioBackend.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public abstract class Realisation {
    private Long id;
    private String libelle;
    private String description;
    private Profil auteur;
}
