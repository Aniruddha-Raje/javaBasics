package basics.initializerBlock;

/**
 * @author Aniruddha.Raje
 *
 */
class Base {

	static {
		System.out.println("1. Base Static Block called");
	}

	{
		System.out.println("3 | 8. Base Initializer Block called");
	}

	Base() {
		System.out.println("4 | 9. Base constructor called!");
	}
}

class Child extends Base {

	static {
		System.out.println("7. Child Static Block called");
	}

	{
		System.out.println("10. Child Initializer Block called");
	}

	Child() {
		System.out.println("11. Child constructor called!");
	}
}

public class UsingInitializer extends Base {

	static {
		System.out.println("2. Main Static Block called");
	}

	{
		System.out.println("5. Main Initializer Block called");
	}

	public UsingInitializer() {
		System.out.println("6. Main Constructor called");
	}

	public static void main(String[] args) {
		UsingInitializer obj = new UsingInitializer();
		System.out.println("==============================\n");
		Child ch = new Child();
	}
}
