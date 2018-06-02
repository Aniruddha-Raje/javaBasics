package basics.binding;

/**
 * @author Aniruddha.Raje
 *
 */
class Base{
	
	void sayHello(){
		System.out.println("Base Hello");
	}
}

public class DynamicBinding extends Base{

	public static void main(String[] args) {
		Base obj = new DynamicBinding();
		obj.sayHello();
	}
	
	/*public void sayHello(){
		System.out.println("Overridden Hello");
	}*/
	
}
