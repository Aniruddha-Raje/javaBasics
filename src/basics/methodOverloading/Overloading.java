package basics.methodOverloading;

public class Overloading {
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.sum(10,20);
	}
	
	public void sum(int a, int b){
		System.out.println("int + int "+(a+b));
	}
	
	public void sum(int a, Integer b){
		System.out.println("int + Integer "+(a+b));
	}
	
	public void sum(Integer a, Integer b){
		System.out.println("Integer + Integer "+(a+b));
	}
	
	public void sum(int a, long b){
		System.out.println("int + long "+(a+b));
	}
}
