package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Article{
    @Id
    private Long id;
    private String description;
    private Date datePublication;
    @OneToMany
    private List<Ressource> ressources;
    @ManyToOne
    @JoinColumn(name = "realisation_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Realisation realisation;
}
