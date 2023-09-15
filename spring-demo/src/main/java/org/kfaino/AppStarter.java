package org.kfaino;

import org.kfaino.config.SpringConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//public class AppStarter implements WebApplicationInitializer {
public class AppStarter  {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(SpringConfig.class);
//
//
//        DispatcherServlet servlet = new DispatcherServlet(context);
//        ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/*");
//    }
}
