package kg.kompanion.springsoap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class SpringServletConfig {
	@Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        return vr;
    }
	
	@Bean
	public RequestMappingHandlerMapping handlerMapping() {
		RequestMappingHandlerMapping h = new RequestMappingHandlerMapping();
		return h;
	}
}
