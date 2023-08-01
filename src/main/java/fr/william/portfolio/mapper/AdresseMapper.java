package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.AdresseDTO;
import fr.william.portfolio.entity.Adresse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AdresseMapper {
    AdresseMapper INSTANCE = Mappers.getMapper(AdresseMapper.class);

    AdresseDTO toDTO(Adresse adresse);

    List<AdresseDTO> toListDTO(List<Adresse> adresses);

    Adresse toEntity(AdresseDTO adresseDTO);
}
