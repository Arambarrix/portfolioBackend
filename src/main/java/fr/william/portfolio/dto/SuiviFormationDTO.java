package fr.william.portfolio.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SuiviFormationDTO {
    private Long id;
    private StructureDTO structureDTO;
    private FormationDTO formationDTO;
    private UtilisateurDTO utilisateurDTO;
    private Date debut;
    private Date fin;
}
