package pl.wsb.spring.storage;

import pl.wsb.spring.model.Article;
import pl.wsb.spring.model.NewArticle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ArticleStorage {
    INSTANCE;
    private final List<Article> articles;

    ArticleStorage() {
        this.articles = new ArrayList<>();
    }

    public void add(NewArticle newArticle){
        Article article = Article.builder()
                .content(newArticle.getContent())
                .title(newArticle.getTitle())
                .published(LocalDateTime.now())
                .tags(Arrays.asList(newArticle.getTags()))
                .build();
        articles.add(article);
    }

    public List<Article> findAll(){
        return new ArrayList<>(articles);
    }
}
