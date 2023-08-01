package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Realisation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private List<Projet> projets;
    private List<Article> articles;
    private List<Distinction> distinctions;
    @ManyToOne
    @JoinColumn(name = "auteur_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Utilisateur auteur;
}
