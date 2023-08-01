package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Article;
import fr.william.portfolio.entity.Projet;
import fr.william.portfolio.entity.Role;
import fr.william.portfolio.entity.SuiviFormation;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UtilisateurDTO {

    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String pseudo;
    private String email;
    private String motDePasse;
    private Role role;
    private List<SuiviFormationDTO> suiviFormationDTOS;
    private List<RealisationDTO> realisationDTOS;
}
