package pl.wsb.spring.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<Html>" +
                "<body>" +
                "<H3>" +
                "Spis serwletów" +
                "</h3>" +
                "<ul>"+
                "<li> <a href ='/query'>Query</a></li>" +
                "<li> <a href ='/cookie'>Cookie</a></li>" +
                "</ul>" +
                "</body" +
                "</html>");
        writer.flush();
    }
}
