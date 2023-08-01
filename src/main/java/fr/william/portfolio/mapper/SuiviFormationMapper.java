package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.SuiviFormationDTO;
import fr.william.portfolio.entity.SuiviFormation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SuiviFormationMapper {
    SuiviFormationMapper INSTANCE = Mappers.getMapper(SuiviFormationMapper.class);

    SuiviFormationDTO toDTO(SuiviFormation suivi);

    List<SuiviFormationDTO> toListDTO(List<SuiviFormation> suivis);

    SuiviFormation toEntity(SuiviFormationDTO suiviDTO);
}
