/**
 * 
 */
package Exception;

/**
 * @author Aniruddha.Raje
 *
 */

/*
 * Checked Exception - IOException, SQLException Checked at compile-time.
 * 
 * Unchecked Exception - ArithmeticException, NullPointerException,
 * ArrayIndexOutOfBoundsException The classes which inherit RuntimeException
 * 
 * Error Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError,
 * AssertionError etc.
 */

public class Exceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 43660007658701134L;

	public Exceptions(String exception) {
		super(exception);
	}

	public static void main(String args[]) {
		try {
			throw new Exceptions("Main!");
		}
		catch (Exceptions e) {
			System.out.println("Exceptions occured: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}

		System.out.println("As expection was handled gracefully,\nrest of the code executes...");
	}

}
