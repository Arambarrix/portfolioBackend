package fr.william.portfolioBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Caracteristique {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private String description;

}
