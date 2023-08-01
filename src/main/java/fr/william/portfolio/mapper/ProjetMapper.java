package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.ProjetDTO;
import fr.william.portfolio.entity.Projet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProjetMapper {
    ProjetMapper INSTANCE = Mappers.getMapper(ProjetMapper.class);

    ProjetDTO toProjetDTO(Projet projet);

    List<ProjetDTO> toListProjetDTO(List<Projet> projets);

    Projet toProjetEntity(Projet projet);
}
