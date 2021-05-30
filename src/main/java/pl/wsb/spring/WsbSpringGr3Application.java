package pl.wsb.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.wsb.spring.model.NewArticle;
import pl.wsb.spring.repository.ArticleRepository;
import pl.wsb.spring.service.BlogService;

@SpringBootApplication
public class WsbSpringGr3Application implements CommandLineRunner {
    private final BlogService service;
    //Tylko do celów demonstracyjnych!!!
    private final ArticleRepository repository;

    public WsbSpringGr3Application(BlogService service, ArticleRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(WsbSpringGr3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        NewArticle newArticle = NewArticle.builder()
                .content("Testowa zawartość")
                .title("Test")
                .tags(new String[]{"AA", "BB"})
                .build();
        service.addArticle(newArticle);
        service.addArticle(
                NewArticle.builder()
                        .content("Artykuł nr 2")
                        .tags(new String[]{"AA", "CC", "DD"})
                        .title("Tytuł nr 2")
                        .build()
        );
        service.addArticle(
                NewArticle.builder()
                        .content("Artykuł nr 3")
                        .tags(new String[]{"BB", "DD"})
                        .title("Artykuł")
                        .build()
        );
        service.changeTitle(3, "ARTYKUL nr 3");
        System.out.println(service.findAll());
        System.out.println(repository.findByFirstLetterInTitle("T%"));
        System.out.println(repository.findByTitleStartsWith("T"));
    }
}
