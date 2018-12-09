/**
 * 
 */
package basics;

/**
 * @author Aniruddha.Raje
 *
 */
public class NumberSwap {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before Swap \n X => " + x + "\n Y => " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swap \n X => " + x + "\n Y => " + y);
	}
}
