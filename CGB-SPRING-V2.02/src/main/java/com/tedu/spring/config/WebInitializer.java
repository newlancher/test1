package com.tedu.spring.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//tomcat 启动时候自动加载
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//load service,dao
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses()");
		return null;
	}
	//load controller
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses()");
		return new Class[] {SpringWebConfig.class};
	}
	//url mapping
	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings()");
		return new String[] {"/"};
	}

}
