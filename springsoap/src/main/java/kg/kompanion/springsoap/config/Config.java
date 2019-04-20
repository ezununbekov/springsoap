package kg.kompanion.springsoap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
@ComponentScan("kg.kompanion.springsoap.service")
public class Config {
	
	@Bean
	public SaajSoapMessageFactory saajSoapMessageFactory() {
		SaajSoapMessageFactory factory = new SaajSoapMessageFactory();
		factory.setSoapVersion(SoapVersion.SOAP_12);
		return factory;
	}
	
	@Bean
	public WebServiceTemplate webServiceTemplate() {
		WebServiceTemplate template = new WebServiceTemplate(saajSoapMessageFactory());
		template.setDefaultUri("http://www.dneonline.com/calculator.asmx");
		//template.setMessageSender(new HttpComponentsMessageSender());
		template.setMarshaller(marshaller());
		template.setUnmarshaller(marshaller());
		return template;
	}
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("kg.kompanion.springsoap.pojo");
		return marshaller;
	}
}
