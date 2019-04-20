package kg.kompanion.springsoap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kg.kompanion.springsoap.pojo.Add;
import kg.kompanion.springsoap.pojo.AddResponse;
import kg.kompanion.springsoap.pojo.Divide;
import kg.kompanion.springsoap.pojo.DivideResponse;
import kg.kompanion.springsoap.pojo.Multiply;
import kg.kompanion.springsoap.pojo.MultiplyResponse;
import kg.kompanion.springsoap.pojo.Subtract;
import kg.kompanion.springsoap.pojo.SubtractResponse;
import kg.kompanion.springsoap.service.CalculatorService;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	int a=10, b=6;
    	ApplicationContext ctx;
    	//ctx = new ClassPathXmlApplicationContext("ctx.xml");
    	ctx = new AnnotationConfigApplicationContext("kg.kompanion.springsoap.config");
    	CalculatorService service = ctx.getBean("calculator", CalculatorService.class);
    	
    	Add addRequest = new Add();
    	addRequest.setIntA(a);
    	addRequest.setIntB(b);
    	
    	Divide divideRequest = new Divide();
    	divideRequest.setIntA(a);
    	divideRequest.setIntB(b);
    	
    	Multiply multiplyRequest = new Multiply();
    	multiplyRequest.setIntA(a);
    	multiplyRequest.setIntB(b);
    	
    	Subtract subtractRequest = new Subtract();
    	subtractRequest.setIntA(a);
    	subtractRequest.setIntB(b);
    	
    	AddResponse addResponse = service.add(addRequest);
    	DivideResponse divideResponse = service.divide(divideRequest);
    	MultiplyResponse multiplyResponse = service.multiply(multiplyRequest);
    	SubtractResponse subtractResponse = service.subtract(subtractRequest);
    	
    	System.out.println(addResponse.getAddResult());
    	System.out.println(divideResponse.getDivideResult());
    	System.out.println(multiplyResponse.getMultiplyResult());
    	System.out.println(subtractResponse.getSubtractResult());
    	
    }
}
