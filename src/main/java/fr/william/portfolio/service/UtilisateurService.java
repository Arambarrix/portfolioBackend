package fr.william.portfolio.service;

import fr.william.portfolio.dto.UtilisateurCreationDTO;
import fr.william.portfolio.dto.UtilisateurDTO;
import fr.william.portfolio.mapper.UtilisateurMapper;
import fr.william.portfolio.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.ignoreCase;

@Service
@AllArgsConstructor
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;
    UtilisateurDTO saveUtilisateurDTO(UtilisateurCreationDTO utilisateurCreationDTO){
        if(utilisateurRepository.findByEmail(utilisateurCreationDTO.getEmail()).isPresent()||utilisateurRepository.findByPseudo(utilisateurCreationDTO.getPseudo()).isPresent()){
            throw new RuntimeException("Utilisateur déjà existant");
        }else{
            return UtilisateurMapper.INSTANCE.toDTO(utilisateurRepository.save(UtilisateurMapper.INSTANCE.toEntity(utilisateurCreationDTO)));
        }
    }
}
