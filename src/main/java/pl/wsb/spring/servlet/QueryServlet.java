package pl.wsb.spring.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getQueryString());
        String user = req.getParameter("user");
        String countStr = req.getParameter("count");
        if (user == null){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().println("Brak wymaganego parametru 'user'!");
            return;
        }
        int count = 1;
        try {
            count = Integer.parseInt(countStr);
        } catch (NumberFormatException e){
        }
        PrintWriter writer = resp.getWriter();
        for(int i = 0; i < count; i++){
            writer.println(user);
        }
    }
}
