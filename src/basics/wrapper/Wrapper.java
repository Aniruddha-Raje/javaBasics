/**
 * 
 */
package basics.wrapper;

/**
 * @author Aniruddha.Raje
 *
 */
public class Wrapper {

	public static void main(String[] args) {
		int a = 20;

		// converting int into Integer
		Integer i = Integer.valueOf(a);

		//autoboxing
		Integer wrapper = a;
		
		//Unboxing
		int primitive = wrapper.intValue();
	}
}
