package basics.abstractKeyword;

//Abstract methods can only reside inside abstract class and interface
//Abstract class can have a Constructor, Instance variables and Concrete methods
//Only 1 class can be extended but Multiple Interfaces can be implemented

/**
 * @author Aniruddha.Raje
 *
 */
abstract class Base {
	
	String str = "Abstract variable";
	
	Base() {
		System.out.println("Abstract Constructor called");
	}

	abstract void sayHello();

	public void sayBye() {
		System.out.println("Base Bye");
	}
}

interface Base2 {
	public void sayBye();
}

public class UsingAbstract extends Base implements Base2 {

	public static void main(String[] args) {
		UsingAbstract obj = new UsingAbstract();
		obj.sayHello();
		obj.sayBye();
		
		System.out.println(obj.str);
	}

	@Override
	void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void sayBye() {
		System.out.println("Bye");
	}

}
