package pl.wsb.spring.service;

import pl.wsb.spring.entity.ArticleEntity;
import pl.wsb.spring.model.NewArticle;

import java.util.List;

public interface BlogService {
    void addArticle(NewArticle newArticle);
    List<ArticleEntity> findAll();
    void changeTitle(long id, String newTitle);
}
