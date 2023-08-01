package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Structure {
    @Id
    private Long id;
    private String nom;
    private TypeStructure typeStructure;
    @ManyToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;
}
