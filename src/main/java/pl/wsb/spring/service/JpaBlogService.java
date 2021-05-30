package pl.wsb.spring.service;

import org.springframework.stereotype.Service;
import pl.wsb.spring.entity.ArticleEntity;
import pl.wsb.spring.model.Article;
import pl.wsb.spring.model.NewArticle;
import pl.wsb.spring.repository.ArticleRepository;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JpaBlogService implements BlogService{
    private final ArticleRepository repository;

    public JpaBlogService(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addArticle(NewArticle newArticle) {
        ArticleEntity entity = ArticleEntity.builder()
                .content(newArticle.getContent())
                .title(newArticle.getTitle())
                .tags(Arrays.toString(newArticle.getTags()))
                .build();
        repository.save(entity);
    }

    @Override
    public List<ArticleEntity> findAll() {
        return repository.findAll();
    }

    @Transactional
    @Override
    public void changeTitle(long id, String newTitle) {
        Optional<ArticleEntity> articleO = repository.findById(id);
        if (articleO.isPresent()){
            ArticleEntity entity = articleO.get();
            entity.setTitle(newTitle);
            repository.flush();
        }
    }
}
