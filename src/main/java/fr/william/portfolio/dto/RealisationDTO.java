package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Utilisateur;
import lombok.Data;

import java.util.List;

@Data
public class RealisationDTO {
    private Long id;
    private Utilisateur utilisateur;
    private List<ProjetDTO> projet;
    private List<ArticleDTO> articles;
    private List<DistinctionDTO> distinctions;
}
