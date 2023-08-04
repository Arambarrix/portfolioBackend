package fr.william.portfolio.dto;

import fr.william.portfolio.entity.TypeProjet;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class ProjetDTO {
    private Long id;
    private String description;
    private Date debut;
    private Date fin;
    private TypeProjet typeProjet;
    private String url;
    private String codeAcces;
    private RealisationDTO realisation;
    private Set<CaracteristiqueDTO> caracteristiques;
    private List<RessourceDTO> ressources;
}
