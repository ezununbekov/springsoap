package kg.kompanion.springsoap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import kg.kompanion.springsoap.pojo.Add;
import kg.kompanion.springsoap.pojo.AddResponse;
import kg.kompanion.springsoap.pojo.Divide;
import kg.kompanion.springsoap.pojo.DivideResponse;
import kg.kompanion.springsoap.pojo.Multiply;
import kg.kompanion.springsoap.pojo.MultiplyResponse;
import kg.kompanion.springsoap.pojo.Subtract;
import kg.kompanion.springsoap.pojo.SubtractResponse;
import kg.kompanion.springsoap.service.CalculatorService;

@Service
public class Calculator implements CalculatorService {

    private WebServiceTemplate webServiceTemplate;
    
    @Autowired
    public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
    	this.webServiceTemplate = webServiceTemplate;
    }
	
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
