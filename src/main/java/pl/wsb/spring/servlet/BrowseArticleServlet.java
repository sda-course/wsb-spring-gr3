package pl.wsb.spring.servlet;

import pl.wsb.spring.storage.ArticleStorage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BrowseArticleServlet extends HttpServlet {
    private static ArticleStorage storage = ArticleStorage.INSTANCE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("articles", storage.findAll());
        req.getRequestDispatcher("/WEB-INF/article-index.jsp").forward(req, resp);
    }
}
