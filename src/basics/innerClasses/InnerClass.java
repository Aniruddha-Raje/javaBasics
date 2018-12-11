/**
 * 
 */
package basics.innerClasses;

/**
 * @author Aniruddha.Raje
 *
 */
//Inner class can access all the members 
//(data members and methods) of outer class including private.
public class InnerClass {

	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		InnerClass outer = new InnerClass();
		InnerClass.Inner inner = outer.new Inner();
		inner.msg();
	}
}
