package pl.wsb.spring.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies == null){
            resp.addCookie(new Cookie("color", "red"));
            return;
        }
        String preferedColor = null;
        //testowanie czy istnieje ciastko o nazwie 'color'
        for(Cookie cookie: cookies){
            if (cookie.getName().equals("color")){
                preferedColor = cookie.getValue();
            }
        }
        //brak ciastka w request, więc dodajemy do odpowiedzi
        if (preferedColor == null){
            Cookie cookieColor = new Cookie("color", "red");
            cookieColor.setMaxAge(100);
            resp.addCookie(cookieColor);
        }
        String login = req.getParameter("login");
        HttpSession session = req.getSession();
        if("karol".equals(login)){
            session.setAttribute("user", "karol");
        }

        resp.getWriter().println("Ciastko w request: " + preferedColor);
    }
}
