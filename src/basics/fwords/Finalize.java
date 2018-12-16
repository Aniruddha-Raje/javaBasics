/**
 * 
 */
package basics.fwords;

/**
 * @author Aniruddha.Raje
 *
 */
public class Finalize {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Finalized!");
		super.finalize();
	}

	public static void main(String[] args) {
		Finalize ob = new Finalize();
		ob = null;
		System.gc();
	}
}
