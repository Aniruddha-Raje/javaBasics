/**
 * 
 */
package basics.abstraction;

/**
 * @author Aniruddha.Raje
 *
 */

interface Inf {
	int a = 10;

	// Does not have a Constructor
	/*
	 * Inf(){
	 * 
	 * }
	 */

	// All methods are abstract by default
	void doThis();
}

abstract class Abs {

	int a = 10;

	Abs() {
		System.out.println("Abstract constructor invoked!");
	}

	abstract void doSomething();

	void nonAbstractMethod() {
		System.out.println("Abstract concrete method called! \nA's value is => " + a);
	}
}

class Child1 extends Abs implements Inf {

	// Child class of an Abstract must implement the parent's methods
	@Override
	void doSomething() {
		System.out.println("doSomething called!");
	}

	// Interface implementing class must implement all interface methods
	@Override
	public void doThis() {
		System.out.println("doThis called!");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		// Cannot instantiate an Abstract class
		// Abs ab = new Abs();

		Abs ab = new Child1();
		ab.doSomething();
		ab.nonAbstractMethod();
		//cannot call Interface's doThis() method
		
		Inf inf = new Child1();
		inf.doThis();
		//cannot call Abstract's doSomething() method
	}
}
