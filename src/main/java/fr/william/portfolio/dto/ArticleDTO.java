package fr.william.portfolio.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ArticleDTO {
    private Long id;
    private String description;
    private Date datePublication;
    private List<RessourceDTO> ressources;
    private RealisationDTO realisation;
}
