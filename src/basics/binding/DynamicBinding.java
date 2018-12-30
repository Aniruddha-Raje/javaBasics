package basics.binding;

/**
 * @author Aniruddha.Raje
 *
 */
class Base{
	
	String str = "Base";
	static String staticStr = "StaticBase";
	
	void sayHello(){
		System.out.println("Base Hello");
	}
	
	void staticHello(){
		System.out.println("Static Base Hello");
	}
}

class Child extends Base{
	
	String str = "Child";
	static String staticStr = "StaticChild";
	
	void sayHello(){
		System.out.println("Child Hello");
	}
	
	void staticHello(){
		System.out.println("Static Child Hello");
	}
}

public class DynamicBinding extends Child{
	
	String str = "GrandChild";
	static String staticStr = "StaticGrandChild";

	public static void main(String[] args) {
		//Base obj = new Base();
		Base obj = new Child();
		//Base obj = new DynamicBinding();
		obj.sayHello();
		obj.staticHello();
		System.out.println("\n"+obj.str);
		System.out.println(obj.staticStr);
	}
	
	public void sayHello(){
		System.out.println("GrandChild Hello");
	}
	
	void staticHello(){
		System.out.println("Static GrandChild Hello");
	}
	
}
