package kg.kompanion.springsoap.service;

import kg.kompanion.springsoap.pojo.wsdl.Add;
import kg.kompanion.springsoap.pojo.wsdl.AddResponse;
import kg.kompanion.springsoap.pojo.wsdl.Divide;
import kg.kompanion.springsoap.pojo.wsdl.DivideResponse;
import kg.kompanion.springsoap.pojo.wsdl.Multiply;
import kg.kompanion.springsoap.pojo.wsdl.MultiplyResponse;
import kg.kompanion.springsoap.pojo.wsdl.Subtract;
import kg.kompanion.springsoap.pojo.wsdl.SubtractResponse;

public interface CalculatorService {
	public AddResponse add(Add addRequest);
	public DivideResponse divide(Divide divideRequest);
	public MultiplyResponse multiply(Multiply multiplyRequest);
	public SubtractResponse subtract(Subtract subtractRequest);
}
