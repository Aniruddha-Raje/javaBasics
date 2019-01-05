/**
 * 
 */
package basics.overriding;

/**
 * @author Aniruddha.Raje
 *
 */

abstract class Parent {
	protected abstract int doSomething(int x); 
}

public class InterviewQuestions extends Parent {
	int n = 10;
	long l = 10;
	
	/*@Override
	protected int doSomething(int x) {
		
		return 0;
	}*/
	
	/*@Override
	public int doSomething(int x) {
		
		return 0;
	}*/
	
	//Cannot reduce the visibility
	/*@Override
	private int doSomething(int x) {
		
		return 0;
	}*/
	
	//return type is incompatible long, Integer, Long, Double, Float
	//Param must be int
	@Override
	public int doSomething(int x) {
		
		return 0;
	}
	
}
