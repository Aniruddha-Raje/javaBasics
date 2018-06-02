package basics.abstractKeyword;

//abstract methods can only reside inside abstract class

/**
 * @author Aniruddha.Raje
 *
 */
abstract class Base{
	Base(){
		System.out.println("Abstract Constructor called");
	}
	
	abstract void sayHello();
	
	public void sayBye(){
		System.out.println("Bye");
	}
}

interface Base2{
	public void sayBye();
}

public class UsingAbstract extends Base implements Base2{

	public static void main(String[] args) {
		UsingAbstract obj = new UsingAbstract();
		obj.sayHello();
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
