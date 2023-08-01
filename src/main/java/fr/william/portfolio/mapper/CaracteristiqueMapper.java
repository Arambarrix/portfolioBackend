package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.CaracteristiqueDTO;
import fr.william.portfolio.entity.Caracteristique;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CaracteristiqueMapper {
    CaracteristiqueMapper INSTANCE = Mappers.getMapper(CaracteristiqueMapper.class);

    CaracteristiqueDTO toDTO(Caracteristique caracteristique);

    List<CaracteristiqueDTO> toListDTO(List<Caracteristique> caracteristiques);

    Caracteristique toEntity(CaracteristiqueDTO caracteristiqueDTO);
}
