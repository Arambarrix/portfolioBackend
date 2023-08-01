package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Structure implements Serializable {
    @Id
    private Long id;
    private String nom;
    private TypeStructure typeStructure;
    @ManyToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;
}
