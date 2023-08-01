package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ville {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "pays_id")
    private Pays pays;

}
