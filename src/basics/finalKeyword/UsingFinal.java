package basics.finalKeyword;

//Constructor cannot be Final, as it is never Inherited

final public class UsingFinal {
	
	int id;
	final String name = "abc";
	final String address;
	final static String contact;
	
	static{
		contact = "mno"; 
	}
	
	public UsingFinal() {
		id = 10;
		//name = "pqr"; //Won't allow
		address = "xyz";
	}
	
	public void sayHello(){
		System.out.println("Hello");
	}
	
	final public void sayBye(){
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {
		UsingFinal obj = new UsingFinal();
	}
}

//Won't allow to Inherit Parent Class if it is Final
/*class Child extends UsingFinal{
	
	//You can Inherit and call the Parent's final method
	UsingFinal obj = new UsingFinal();
	obj.sayBye();
	
	//But won't allow to override final method of Parent class
	public void sayBye(){
		System.out.println("Overridden Bye");
	}
	 
}
*/