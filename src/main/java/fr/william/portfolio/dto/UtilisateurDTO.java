package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Role;
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
    private Role role;
    private List<SuiviFormationDTO> suiviFormations;
    private List<RealisationDTO> realisations;
}
