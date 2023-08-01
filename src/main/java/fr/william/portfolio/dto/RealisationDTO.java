package fr.william.portfolio.dto;

import lombok.Data;

import java.util.List;
@Data
public class RealisationDTO {
    private Long id;
    private UtilisateurDTO utilisateurDTO;
    private List<ProjetDTO> projetDTOS;
    private List<ArticleDTO> articleDTOS;
    private List<DistinctionDTO> distinctionDTOS;
}
