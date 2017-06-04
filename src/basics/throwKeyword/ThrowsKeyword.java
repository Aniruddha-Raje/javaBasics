package basics.throwKeyword;

public class ThrowsKeyword {

	public static void main(String[] args) {
		try {
			validate(17);
		} catch (Exception e) {
			
		}
	}
	
	static void validate(int age) throws ArithmeticException{
		if(age<18)  
			throw new ArithmeticException("not valid");  
		else  
		    System.out.println("welcome to vote");
	}
}
