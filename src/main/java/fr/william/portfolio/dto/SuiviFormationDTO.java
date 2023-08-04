package fr.william.portfolio.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SuiviFormationDTO {
    private Long id;
    private StructureDTO structure;
    private FormationDTO formation;
    private UtilisateurDTO utilisateur;
    private Date debut;
    private Date fin;
}
