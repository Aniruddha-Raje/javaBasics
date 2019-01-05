/**
 * 
 */
package Exception;

/**
 * @author Aniruddha.Raje
 *
 */
public class InterviewQuestion {

	public static void main(String[] args) {
		// i must be declared outside the try catch statements
		// i must also be initiated with default value
		int i = 0;
		
		try {
			String str = "hello";
			i = Integer.parseInt(str);

		} catch (NumberFormatException e) {
			i = 10;
		} finally {
			System.out.println(i);
		}

	}

}
