package kg.kompanion.springsoap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kg.kompanion.springsoap.pojo.json.Request;
import kg.kompanion.springsoap.pojo.json.Response;
import kg.kompanion.springsoap.pojo.wsdl.Add;
import kg.kompanion.springsoap.pojo.wsdl.AddResponse;
import kg.kompanion.springsoap.service.CalculatorService;

@RestController("/calculate")
public class CalculatorController {
	
	@Autowired
	private CalculatorService service;
	
	@PostMapping("/add")
	public Response add(@RequestBody Request request) {
		Add add = new Add();
		add.setIntA((Integer)request.getParams().get("intA"));
		add.setIntB((Integer)request.getParams().get("intB"));
		AddResponse addResponse = service.add(add);
		Response response = new Response();
		response.setResult("OK");
		response.getParams().put("AddResult", addResponse.getAddResult());
		return response;
	}
}
