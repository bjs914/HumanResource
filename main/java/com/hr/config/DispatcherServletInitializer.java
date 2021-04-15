package com.hr.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//db에 대한 설정이 저장된 클래스를 연결
		return new Class[] {RootApplicationContextConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// 콘트롤러 클래스와 뷰 파일을 알려줌
		return new Class[] {WebApplicationContextConfig.class};
	}

	@Override	
	protected String[] getServletMappings() {
		//배정기 서블릿의 서블릿 매핑을 지정(web.xml에서)
		return new String[] {"/"};
	}
	
	@Override	
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        
        return new Filter[] { characterEncodingFilter };
    }

}
