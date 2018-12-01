/**
 * 
 */
package basics.staticKeyword;

/**
 * @author Aniruddha.Raje
 *
 */
public class StaticProblem {
	
	static String str = "Hello";
	
	private void changeValue(String s) {
		str = s;
	}
	
	private String displayValue() {
		return str;
	}
	
	public static void main(String[] args) {
		StaticProblem ob1 = new StaticProblem();
		StaticProblem ob2 = new StaticProblem();
		ob2.changeValue("World");
		
		System.out.println(ob1.displayValue());
		System.out.println(ob2.displayValue());
	}
}
