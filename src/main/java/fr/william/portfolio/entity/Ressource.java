package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ressource implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String desciption;
    private TypeRessource type;
    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] fichier;
}
