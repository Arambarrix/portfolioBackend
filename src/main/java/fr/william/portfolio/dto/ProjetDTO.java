package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Caracteristique;
import fr.william.portfolio.entity.Realisation;
import fr.william.portfolio.entity.Ressource;
import fr.william.portfolio.entity.TypeProjet;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class ProjetDTO {
    private Long id;
    private String description;
    private Date debut;
    private Date fin;
    private TypeProjet typeProjet;
    private String url;
    private String codeAcces;
    private RealisationDTO realisationDTO;
    private Set<CaracteristiqueDTO> caracteristiqueDTOS;
    private List<RessourceDTO> ressourceDTOS;
}
