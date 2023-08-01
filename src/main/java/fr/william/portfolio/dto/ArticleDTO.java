package fr.william.portfolio.dto;

import fr.william.portfolio.entity.Realisation;
import fr.william.portfolio.entity.Ressource;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.List;

@Data
public class ArticleDTO {
    private Long id;
    private String description;
    private Date datePublication;
    private List<Ressource> ressources;
    private Realisation realisation;
}
