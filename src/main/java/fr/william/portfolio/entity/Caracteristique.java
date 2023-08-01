package fr.william.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Caracteristique implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private String description;

}
