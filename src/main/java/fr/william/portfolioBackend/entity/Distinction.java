package fr.william.portfolioBackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
public class Distinction extends Realisation{
    private Date dateObtention;
    @ManyToOne
    @JoinColumn(name = "ressource_id")
    private Ressource ressource;
}
