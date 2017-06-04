package basics.throwKeyword;

public class ThrowKeyword {
	public static void main(String[] args) {
		try {
			validate(17);
		} catch (Exception e) {
			System.out.println("Caught "+e);
		}
		
		System.out.println("rest of the code...");
	}
	
	static void validate(int age){
		if(age<18)  
			throw new ArithmeticException("not valid");  
		else  
		    System.out.println("welcome to vote");
	}
}