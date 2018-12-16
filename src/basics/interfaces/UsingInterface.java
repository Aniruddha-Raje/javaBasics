package basics.interfaces;

/**
 * @author Aniruddha.Raje
 *
 */
interface Base{
	public void sayHello();
	public static void sayBye(){
		System.out.println("Interface's static Bye");
	}
	
	public default void defaultSayBye(){
		System.out.println("Interface's dafualt Bye");
	}
}

public class UsingInterface implements Base{
	public static void main(String[] args) {
		Base obj = new UsingInterface();
		obj.defaultSayBye();
		Base.sayBye();
	}

	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
}
