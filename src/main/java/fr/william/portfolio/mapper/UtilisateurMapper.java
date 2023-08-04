package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.UtilisateurConnexionDTO;
import fr.william.portfolio.dto.UtilisateurCreationDTO;
import fr.william.portfolio.dto.UtilisateurDTO;
import fr.william.portfolio.entity.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UtilisateurMapper {
    UtilisateurMapper INSTANCE = Mappers.getMapper(UtilisateurMapper.class);

    UtilisateurDTO toDTO(Utilisateur utilisateur);

    List<UtilisateurDTO> toListDTO(List<Utilisateur> utilisateurs);

    Utilisateur toEntity(UtilisateurDTO utilisateurDTO);

    Utilisateur toEntity(UtilisateurCreationDTO utilisateurCreationDTO);

    Utilisateur toEntity(UtilisateurConnexionDTO utilisateurConnexionDTO);
}
