package com.edu.alumnosGestion;





import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AlumnosGestionApplication extends SpringBootServletInitializer  {	
	public static void main(String[] args) {
		SpringApplication.run(AlumnosGestionApplication.class, args);
		Logger loggerx = LoggerFactory.getLogger(AlumnosGestionApplication.class);
		loggerx.info("Listo, cargo spring");
	}
	//SIN ESTO NO CARGA SPRING AL GENERAR UN ARCHIVO WAR (DEPLOY EN UN TOMCAT POR EJEMPLO)
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AlumnosGestionApplication.class);
    }

}
