package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.PaysDTO;
import fr.william.portfolio.entity.Pays;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PaysMapper {
    PaysMapper INSTANCE = Mappers.getMapper(PaysMapper.class);

    PaysDTO toDTO(Pays pays);

    List<PaysDTO> toListDTO(List<Pays> paysList);

    Pays toEntity(PaysDTO paysDTO);
}
