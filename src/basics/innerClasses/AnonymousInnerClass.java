/**
 * 
 */
package basics.innerClasses;

/**
 * @author Aniruddha.Raje
 *
 */
/*
 * It should be used if you have to override method of class or interface. Two
 * ways to create a Java Anonymous inner class- 1. Class (may be abstract or
 * concrete). 2. Interface
 */

public class AnonymousInnerClass {

	private int data = 10;

	public static void main(String args[]) {
		AnonymousInnerClass ob = new AnonymousInnerClass();

		//Interface example
		WorkerInf workerInf = new WorkerInf() {
			@Override
			public void doSomething() {
				System.out.println("Data => " + ob.data);
			}
		};
		workerInf.doSomething();
		
		//Abstract example
		WorkerAb workerAb = new WorkerAb() {
			@Override
			public void doAction() {
				System.out.println("Data => " + ob.data);
			}
		};
		workerAb.doAction();
	}
}

interface WorkerInf {
	void doSomething();
}

abstract class WorkerAb {
	abstract void doAction();
}