package com.tedu.spring.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 *  在此类中配置spring mvc组件
 * @author Administrator
 */
@ComponentScan("com.cy.spring.controller")
@EnableWebMvc //<mvc:annotation-driven/>
public class SpringWebConfig implements WebMvcConfigurer{//spring-configs.xml
	//<mvc:default-servlet-handler/>
    @Override
    public void configureDefaultServletHandling(
    	DefaultServletHandlerConfigurer configurer) {
    	configurer.enable();
    }
    //配置视图解析
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    	registry.jsp("/WEB-INF/pages/", ".html");
    }
}









