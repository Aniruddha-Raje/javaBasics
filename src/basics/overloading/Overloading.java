package basics.overloading;

/**
 * @author Aniruddha.Raje
 *
 */
public class Overloading {
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.sum(10,20);
	}
	
	public void sum(int a, int b){
		System.out.println("int + int called!");
	}
	
	public void sum(int a, Integer b){
		System.out.println("int + Integer called!");
	}
	
	public void sum(Integer a, Integer b){
		System.out.println("Integer + Integer called!");
	}
	
	public void sum(int a, long b){
		System.out.println("int + long called!");
	}
}
