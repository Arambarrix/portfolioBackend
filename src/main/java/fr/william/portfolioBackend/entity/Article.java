package fr.william.portfolioBackend.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Article extends Realisation{
    private Date datePublication;
    private List<Ressource> ressources;

}
