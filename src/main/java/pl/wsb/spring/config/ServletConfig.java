package pl.wsb.spring.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wsb.spring.servlet.*;

@Configuration
public class ServletConfig {

    @Bean
    ServletRegistrationBean<HomeServlet> getHomeServlet(){
        ServletRegistrationBean<HomeServlet> register = new ServletRegistrationBean<>();
        register.addUrlMappings("/");
        register.setServlet(new HomeServlet());
        register.setLoadOnStartup(1);
        return register;
    }
    @Bean
    ServletRegistrationBean<QueryServlet> getQueryServlet(){
        ServletRegistrationBean<QueryServlet> register = new ServletRegistrationBean<>();
        register.addUrlMappings("/query");
        register.setServlet(new QueryServlet());
        register.setLoadOnStartup(1);
        return register;
    }
    @Bean
    ServletRegistrationBean<CookieServlet> getCookieServlet(){
        ServletRegistrationBean<CookieServlet> register = new ServletRegistrationBean<>();
        register.addUrlMappings("/cookie");
        register.setServlet(new CookieServlet());
        register.setLoadOnStartup(1);
        return register;
    }

    @Bean
    ServletRegistrationBean<AddBlogArticleServlet> getAddArticleServlet(){
        ServletRegistrationBean<AddBlogArticleServlet> register = new ServletRegistrationBean<>();
        register.addUrlMappings("/blog/add");
        register.setServlet(new AddBlogArticleServlet());
        register.setLoadOnStartup(1);
        return register;
    }

    @Bean
    ServletRegistrationBean<BrowseArticleServlet> getBrowseArticleServlet(){
        ServletRegistrationBean<BrowseArticleServlet> register = new ServletRegistrationBean<>();
        register.addUrlMappings("/blog/browse");
        register.setServlet(new BrowseArticleServlet());
        register.setLoadOnStartup(1);
        return register;
    }

}
