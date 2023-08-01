package fr.william.portfolio.mapper;

import fr.william.portfolio.dto.ArticleDTO;
import fr.william.portfolio.entity.Article;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ArticleMapper {
    ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);


    ArticleDTO toArticleDTO(Article article);

    List<ArticleDTO> toListArticleDTO(List<Article> articles);

    Article toEntityArticle(ArticleDTO articleDTO);
}
