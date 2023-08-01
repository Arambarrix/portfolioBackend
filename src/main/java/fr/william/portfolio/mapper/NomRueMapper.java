package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.NomRueDTO;
import fr.william.portfolio.entity.NomRue;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NomRueMapper {
    NomRueMapper INSTANCE = Mappers.getMapper(NomRueMapper.class);

    NomRueDTO toDTO(NomRue nomRue);

    List<NomRueDTO> toListDTO(List<NomRue> nomRues);

    NomRue toEntity(NomRueDTO nomRueDTO);
}
