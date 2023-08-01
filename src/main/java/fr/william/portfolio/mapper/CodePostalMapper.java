package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.CodePostalDTO;
import fr.william.portfolio.entity.CodePostal;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CodePostalMapper {
    CodePostalMapper INSTANCE = Mappers.getMapper(CodePostalMapper.class);

    CodePostalDTO toDTO(CodePostal codePostal);

    List<CodePostalDTO> toListDTO(List<CodePostal> codePostals);

    CodePostal toEntity(CodePostalDTO codePostalDTO);
}
