package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Role;
import lombok.Data;

@Data
public class UtilisateurConnexionDTO {

    private Long id;
    private String pseudo;
    private String email;
    private String motDePasse;
    private Role role;
}
