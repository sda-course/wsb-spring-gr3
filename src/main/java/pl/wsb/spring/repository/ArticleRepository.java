package pl.wsb.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.wsb.spring.entity.ArticleEntity;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
    @Query("select a from ArticleEntity a where a.title like :template")
    List<ArticleEntity> findByFirstLetterInTitle(String template);

    List<ArticleEntity> findByTitleStartsWith (String t);
}
