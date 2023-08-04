package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Role;
import lombok.Data;

import java.util.Date;

@Data
public class UtilisateurCreationDTO {
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String pseudo;
    private String email;
    private String motDePasse;
    private Role role;
}
