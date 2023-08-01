package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
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
    @OneToMany
    private List<Ressource> ressources;
}
