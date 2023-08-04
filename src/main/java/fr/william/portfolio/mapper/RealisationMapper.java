package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.RealisationDTO;
import fr.william.portfolio.entity.Realisation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RealisationMapper {
    RealisationMapper INSTANCE = Mappers.getMapper(RealisationMapper.class);


    RealisationDTO toRealisationDTO(Realisation realisation);

    List<RealisationDTO> toListRealisationDTO(List<Realisation> realisations);

    Realisation toEntityRealisation(RealisationDTO realisationDTO);
}
