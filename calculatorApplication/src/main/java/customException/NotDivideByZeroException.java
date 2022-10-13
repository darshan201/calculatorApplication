package customException;



// i am not getting custom exception so please help me  




@SuppressWarnings("serial")
public class NotDivideByZeroException extends java.lang.ArithmeticException {
	NotDivideByZeroException(){
		super();
	}
	NotDivideByZeroException(String msg){
		super(msg);
	}
	
}
