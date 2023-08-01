package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.VilleDTO;
import fr.william.portfolio.entity.Ville;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VilleMapper {
    VilleMapper INSTANCE = Mappers.getMapper(VilleMapper.class);

    VilleDTO toDTO(Ville ville);

    List<VilleDTO> toListDTO(List<Ville> villes);

    Ville toEntity(VilleDTO villeDTO);
}
