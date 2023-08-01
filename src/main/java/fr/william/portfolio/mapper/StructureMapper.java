package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.StructureDTO;
import fr.william.portfolio.entity.Structure;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StructureMapper {
    StructureMapper INSTANCE = Mappers.getMapper(StructureMapper.class);

    StructureDTO toDTO(Structure structure);

    List<StructureDTO> toListDTO(List<Structure> structures);

    Structure toEntity(StructureDTO structureDTO);
}
