package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Ville implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "pays_id")
    private Pays pays;

}
