package basics.overriding;

/**
 * @author Aniruddha.Raje
 *
 */

// You cannot override a private or static method in Java.
class Base {
	int a = 10;
	static int b = 20;

	// Gets overridden
	public void sayHello() {
		System.out.println("Parent Hello");
		System.out.println("A => " + a + "\nB => " + b);
	}

	// Static method cannot be overridden
	public static void sayBye() {
		System.out.println("Parent Bye");
		System.out.println("B => " + b);
	}
}

public class Overriding extends Base {

	public static void main(String[] args) {
		Base obj = new Overriding();
		obj.sayHello();
		obj.sayBye();
		// Reference can access both Static and Non Static variables
		System.out.println("A = " + obj.a);
		System.out.println("B = " + obj.b);
	}

	@Override
	public void sayHello() {
		System.out.println("Child Hello");
	}

	// Static method cannot be overridden
	// @Override
	public static void sayBye() {
		System.out.println("Child Bye");
	}
}
