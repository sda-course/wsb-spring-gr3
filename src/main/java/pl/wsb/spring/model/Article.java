package pl.wsb.spring.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class Article {
    private String title;
    private String content;
    private List<String> tags;
    private LocalDateTime published;
}
