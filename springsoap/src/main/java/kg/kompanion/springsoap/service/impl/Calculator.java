package kg.kompanion.springsoap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import kg.kompanion.springsoap.pojo.wsdl.Add;
import kg.kompanion.springsoap.pojo.wsdl.AddResponse;
import kg.kompanion.springsoap.pojo.wsdl.Divide;
import kg.kompanion.springsoap.pojo.wsdl.DivideResponse;
import kg.kompanion.springsoap.pojo.wsdl.Multiply;
import kg.kompanion.springsoap.pojo.wsdl.MultiplyResponse;
import kg.kompanion.springsoap.pojo.wsdl.Subtract;
import kg.kompanion.springsoap.pojo.wsdl.SubtractResponse;
import kg.kompanion.springsoap.service.CalculatorService;

@Service
public class Calculator implements CalculatorService {

	@Autowired
    private WebServiceTemplate webServiceTemplate;
    
//    @Autowired
//    public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
//    	this.webServiceTemplate = webServiceTemplate;
//    }
	
	@Override
	public AddResponse add(Add addRequest) {
		AddResponse response = (AddResponse) webServiceTemplate
				.marshalSendAndReceive(addRequest, new SoapActionCallback("http://tempuri.org/Add"));
		return response;
	}

	@Override
	public DivideResponse divide(Divide divideRequest) {
		DivideResponse response = (DivideResponse) webServiceTemplate
				.marshalSendAndReceive(divideRequest, new SoapActionCallback("http://tempuri.org/Divide"));
		return response;
	}

	@Override
	public MultiplyResponse multiply(Multiply multiplyRequest) {
		MultiplyResponse response = (MultiplyResponse) webServiceTemplate
				.marshalSendAndReceive(multiplyRequest, new SoapActionCallback("http://tempuri.org/Multiply"));
		return response;
	}

	@Override
	public SubtractResponse subtract(Subtract subtractRequest) {
		SubtractResponse response = (SubtractResponse) webServiceTemplate
				.marshalSendAndReceive(subtractRequest, new SoapActionCallback("http://tempuri.org/Subtract"));
		return response;
	}

}
