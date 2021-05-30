package pl.wsb.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewArticle {
    private String title;
    private String content;
    private String[] tags;
}
