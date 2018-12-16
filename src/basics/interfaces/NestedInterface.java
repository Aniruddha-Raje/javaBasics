package basics.interfaces;

/**
 * @author Aniruddha.Raje
 *
 */
interface OuterInterface{  
	  void show();
	  
	  interface InnerInterface{  
		  void sayHello();  
	  }  

}

class OuterClass{
	interface InnerClassInterface{
		void sayBye();
	}
}
	
public class NestedInterface implements OuterInterface.InnerInterface, OuterClass.InnerClassInterface{

	public static void main(String[] args) {
		NestedInterface obj = new NestedInterface();
		obj.sayHello();
				
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void sayBye() {
		System.out.println("Bye");
	}
}
