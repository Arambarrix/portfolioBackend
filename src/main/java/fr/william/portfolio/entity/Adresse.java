package fr.william.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adresse implements Serializable {
    @Id
    private Long id;
    @ManyToOne
    private NomRue nom;
    private Integer numero;
    private TypeRue typeRue;
    @ManyToOne
    @JoinColumn(name = "code_postal_id")
    private CodePostal codePostal;
}
