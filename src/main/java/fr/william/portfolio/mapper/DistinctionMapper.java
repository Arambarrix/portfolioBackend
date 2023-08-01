package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.DistinctionDTO;
import fr.william.portfolio.entity.Distinction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DistinctionMapper {
    DistinctionMapper INSTANCE = Mappers.getMapper(DistinctionMapper.class);


    DistinctionDTO toDistinctionDTO(Distinction distinction);

    List<DistinctionDTO> toListDistinctionDTO(List<Distinction> distinctions);

    Distinction toEntityDistinction(DistinctionDTO distinctionDTO);
}
