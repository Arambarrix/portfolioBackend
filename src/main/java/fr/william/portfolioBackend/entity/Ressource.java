package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ressource {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String desciption;
    private TypeRessource type;
    @Lob
    @Column(columnDefinition="BLOB")
    private byte[] fichier;
}
