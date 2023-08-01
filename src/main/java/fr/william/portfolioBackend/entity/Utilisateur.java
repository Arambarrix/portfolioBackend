package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    @Column(unique = true)
    private String pseudo;
    @Column(unique = true)
    private String email;
    private String motDePasse;
    private Role role;
    private List<SuiviFormation> suiviFormations;
    private List<Realisation> realisations;
}
