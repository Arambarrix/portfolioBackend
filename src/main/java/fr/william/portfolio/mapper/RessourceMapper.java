package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.RessourceDTO;
import fr.william.portfolio.entity.Ressource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RessourceMapper {
    RessourceMapper INSTANCE = Mappers.getMapper(RessourceMapper.class);

    RessourceDTO toDTO(Ressource ressource);

    List<RessourceDTO> toListDTO(List<Ressource> ressources);

    Ressource toEntity(RessourceDTO ressourceDTO);
}
