package fr.william.portfolioBackend.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
public class Distinction extends Realisation{
    private Date dateObtention;
    private Ressource ressource;
}
