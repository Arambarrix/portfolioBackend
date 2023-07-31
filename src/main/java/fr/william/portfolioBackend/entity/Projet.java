package fr.william.portfolioBackend.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@Builder
public abstract class Projet extends Realisation{
    private Date debut;
    private Date fin;
    private Set<Caracteristique> caracteristiques;
    private List<Ressource> ressources;
}
