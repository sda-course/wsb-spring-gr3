package pl.wsb.spring.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wsb.spring.servlet.HomeServlet;

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
}
