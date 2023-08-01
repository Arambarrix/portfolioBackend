package fr.william.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Getter
@Setter
@Entity
public class Distinction{
    @Id
    private Long id;
    private String description;
    private Date dateObtention;
    @ManyToOne
    @JoinColumn(name = "ressource_id")
    private Ressource ressource;
    @ManyToOne
    @JoinColumn(name = "realisation_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Realisation realisation;
}
