package pl.wsb.spring.servlet;

import pl.wsb.spring.model.NewArticle;
import pl.wsb.spring.storage.ArticleStorage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddBlogArticleServlet extends HttpServlet {
    private final ArticleStorage storage = ArticleStorage.INSTANCE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/add-article-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String tagsStr = req.getParameter("tags");
        String[] tags = tagsStr.split("\\s");
        NewArticle article = NewArticle.builder()
                .title(title)
                .content(content)
                .tags(tags)
                .build();
        storage.add(article);
        System.out.println(storage.findAll());
        resp.sendRedirect("/blog/browse");
    }
}
