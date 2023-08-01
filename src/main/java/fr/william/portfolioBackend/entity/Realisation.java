package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class Realisation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String libelle;
    private String description;
    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Utilisateur auteur;
}
