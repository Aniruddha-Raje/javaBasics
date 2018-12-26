package basics.initializerBlock;

/**
 * @author Aniruddha.Raje
 *
 */
class Base{
	
	static{
		System.out.println("1. Base Static Block called");
	}
	
	{
		System.out.println("2. Base Initializer Block called");
	}
	
	Base(){
		System.out.println("3. Base constructor called!");
	}
}

public class UsingInitializer extends Base {

	{
		System.out.println("4. Child Initializer Block called");
	}
	
	public UsingInitializer() {
		System.out.println("5. Child Constructor called");
	}

	public static void main(String[] args) {
		UsingInitializer obj = new UsingInitializer();
	}
}
