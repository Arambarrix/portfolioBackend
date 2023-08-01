package fr.william.portfolioBackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Projet extends Realisation{
    private Date debut;
    private Date fin;
    private TypeProjet typeProjet;
    private String url;
    private String codeAcces;
    @ManyToMany
    private Set<Caracteristique> caracteristiques;
    @ManyToMany
    private List<Ressource> ressources;
}
