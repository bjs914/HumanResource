package com.hr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.hr"}, excludeFilters=@ComponentScan.Filter(Configuration.class))
public class WebApplicationContextConfig extends WebMvcConfigurerAdapter{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/").addResourceLocations("/resources/**");
    }
	
	@Override
	public void configureDefaultServletHandling(
	DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
	//configureDefaultServletHandling(): 디폴트 서블릿 핸들러를 위한 설정 담당
	}
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		//InternalResourceViewResolver : view에 대한 방법을 결정해줌	
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
