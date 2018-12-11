/**
 * 
 */
package basics.innerClasses;

/**
 * @author Aniruddha.Raje
 *
 */

// A class i.e. created inside a method is called local inner class in java.
// If you want to invoke the methods of local inner class,
// you must instantiate this class inside the method.
public class LocalInnerClass {

	private int data = 30;

	void display() {

		// local variable must be final till jdk 1.7 only
		int value = 50;

		class Local {
			void msg() {
				System.out.println("Data => " + data + "\nValue => " + value);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
}