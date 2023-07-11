package co.edu.udec.act3.jonnyluna.vehiculos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class MvcConfig {
    public void addViewController(ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/registro").setViewName("registro");
        registry.addViewController("/login").setViewName("login");
    }
}
