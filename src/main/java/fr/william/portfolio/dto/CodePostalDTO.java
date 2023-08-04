package fr.william.portfolio.dto;

import lombok.Data;

@Data
public class CodePostalDTO {
    private Long id;
    private LocaliteDTO localite;
    private Integer numero;
}
