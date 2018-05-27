package basics.staticKeyword;

public class StaticMethodRetrictions {
	int a = 40;// non static
	static int b = 50;

	public static void main(String args[]) {
		// System.out.println(a);//Won't allow
		System.out.println(b);
		staticBye();
		// sayHello(); //Won't allow

	}

	public void sayHello() {
		System.out.println("Hello");
		
		sayBye(); // Non static methods can call other non static methods
		staticBye();// Non static methods can call other static methods
	}

	public void sayBye() {
		System.out.println("Bye");
	}

	public static void staticBye() {
		System.out.println("static Bye");
	}
}
