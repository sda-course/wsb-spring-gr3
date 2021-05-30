package pl.wsb.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "article")
@Entity
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(length = 20000, nullable = false)
    private String content;
    private String tags;
    //adnotacja z Hibernate!!!
    @CreationTimestamp
    private Timestamp published;

    @PostPersist
    public void logPersist(){
        System.out.println("Artykuł dodany do bazy");
    }
}