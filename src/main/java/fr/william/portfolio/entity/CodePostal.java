package fr.william.portfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "code_postal")
public class CodePostal implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "localite_id")
    private Localite localite;
    private Integer numero;

}