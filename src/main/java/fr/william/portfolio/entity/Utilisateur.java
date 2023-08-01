package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur implements Serializable {
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
    @OneToMany
    private List<SuiviFormation> suiviFormations;
    @OneToMany
    private List<Realisation> realisations;
}
