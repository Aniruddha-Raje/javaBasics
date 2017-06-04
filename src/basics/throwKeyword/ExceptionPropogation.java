package basics.throwKeyword;

public class ExceptionPropogation {
	public static void main(String[] args) {
		ExceptionPropogation ob = new ExceptionPropogation();
		
		try {
			ob.outer();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}
	
	public void innerMost(){
		int data = 100/0;
		//throw new java.io.IOException("device error");//checked exception 
	}
	
	public void inner(){
		innerMost();
	}
	
	public void outer(){
		inner();		
	}
}
