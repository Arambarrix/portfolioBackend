package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.FormationDTO;
import fr.william.portfolio.entity.Formation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FormationMapper {
    FormationMapper INSTANCE = Mappers.getMapper(FormationMapper.class);

    FormationDTO toDTO(Formation formation);

    List<FormationDTO> toListDTO(List<Formation> formations);

    Formation toEntity(FormationDTO formationDTO);
}
