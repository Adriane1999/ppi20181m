package agendaspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import agendaspring.controllers.HomeControllers;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeControllers.class})
public class AppWebConfiguration {

}
