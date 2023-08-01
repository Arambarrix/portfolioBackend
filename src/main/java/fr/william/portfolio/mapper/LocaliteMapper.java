package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.LocaliteDTO;
import fr.william.portfolio.entity.Localite;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LocaliteMapper {
    LocaliteMapper INSTANCE = Mappers.getMapper(LocaliteMapper.class);

    LocaliteDTO toDTO(Localite localite);

    List<LocaliteDTO> toListDTO(List<Localite> localites);

    Localite toEntity(LocaliteDTO localiteDTO);
}
