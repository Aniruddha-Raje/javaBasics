/**
 * 
 */
package basics.inheritance;

/**
 * @author Aniruddha.Raje
 *
 */

class Parent{
	
	//Gets called, why?
	int a = 20;
	
	public void print() {
		System.out.println("Parent method");
	}
}

public class Child extends Parent {
	
	int a = 10;

	public static void main(String[] args) {
		
		Parent ob = new Child();
		ob.print();
		
		System.out.println(ob.a);
	}
	
	//Gets called
	public void print() {
		System.out.println("Child method");
	}
}
