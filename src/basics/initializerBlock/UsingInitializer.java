package basics.initializerBlock;

/**
 * @author Aniruddha.Raje
 *
 */
class Base{
	Base(){
		System.out.println("Base Class constructor called!");
	}
	
	{
		System.out.println("Base Initializer Block called");
	}
}

public class UsingInitializer extends Base {

	
	public UsingInitializer() {
		super();
		System.out.println("Child Constructor called");
	}
	
	{
		System.out.println("Child Initializer Block called");
	}

	public static void main(String[] args) {
		UsingInitializer obj = new UsingInitializer();
	}
}
