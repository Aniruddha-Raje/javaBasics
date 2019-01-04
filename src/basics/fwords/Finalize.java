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
		
		//Called before garbage is collected
		System.out.println("Object Finalized!");
		super.finalize();
	}

	public static void main(String[] args) {
		Finalize ob = new Finalize();
		ob = null;
		
		//To start collecting garbage
		System.gc();
	}
}
