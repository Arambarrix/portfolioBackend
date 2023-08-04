package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Projet implements Serializable {
    @Id
    private Long id;
    private String description;
    private Date debut;
    private Date fin;
    private TypeProjet typeProjet;
    private String url;
    private String codeAcces;
    @ManyToOne
    @JoinColumn(name = "realisation_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Realisation realisation;
    @ManyToMany
    private Set<Caracteristique> caracteristiques;
    @ManyToMany
    private List<Ressource> ressources;
}
