package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Localite {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;

}
