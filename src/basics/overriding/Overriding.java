package basics.overriding;

/**
 * @author Aniruddha.Raje
 *
 */

//You cannot override a private or static method in Java.
class Base{
	public void sayHello(){
		System.out.println("Parent Hello");
	}
	
	public static void sayBye(){
		System.out.println("Parent Bye");
	}
}

public class Overriding extends Base{

	public static void main(String[] args) {
		Base obj = new Overriding();
		obj.sayHello();
		obj.sayBye();
	}
	
	public void sayHello(){
		System.out.println("Child Hello");
	}
	
	//Static method cannot be overridden
	public static void sayBye(){
		System.out.println("Child Bye");
	}
}
