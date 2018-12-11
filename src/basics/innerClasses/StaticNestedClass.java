/**
 * 
 */
package basics.innerClasses;

/**
 * @author Aniruddha.Raje
 *
 */
public class StaticNestedClass {
	static int data = 30;
	int var = 10;

	static class Inner {
		void concreteMethod() {
			System.out.println("concreteMethod => " + data);
		}

		static void staticMethod() {
			System.out.println("staticMethod => " + data);
		}
	}

	public static void main(String args[]) {
		StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
		obj.concreteMethod();
		StaticNestedClass.Inner.staticMethod();
	}
}
