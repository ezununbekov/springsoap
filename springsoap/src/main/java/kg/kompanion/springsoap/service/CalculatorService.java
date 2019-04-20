package kg.kompanion.springsoap.service;

import kg.kompanion.springsoap.pojo.Add;
import kg.kompanion.springsoap.pojo.AddResponse;
import kg.kompanion.springsoap.pojo.Divide;
import kg.kompanion.springsoap.pojo.DivideResponse;
import kg.kompanion.springsoap.pojo.Multiply;
import kg.kompanion.springsoap.pojo.MultiplyResponse;
import kg.kompanion.springsoap.pojo.Subtract;
import kg.kompanion.springsoap.pojo.SubtractResponse;

public interface CalculatorService {
	public AddResponse add(Add addRequest);
	public DivideResponse divide(Divide divideRequest);
	public MultiplyResponse multiply(Multiply multiplyRequest);
	public SubtractResponse subtract(Subtract subtractRequest);
}
