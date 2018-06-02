package basics;

/**
 * @author Aniruddha.Raje
 *
 */
class A {
	void demo() {
		System.out.println("Called A demo");
	}
}

public class Inheritance extends A {

	void demo() {
		System.out.println("Called Inheritance demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A ob = new Inheritance();
		ob.demo();
	}

}
