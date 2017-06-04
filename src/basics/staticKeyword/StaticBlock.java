package basics.staticKeyword;

public class StaticBlock {
	static{
		System.out.println("I'll be called before Main method");
	}  
	  
	public static void main(String args[]){  
		System.out.println("Hello main");  
	}
}
