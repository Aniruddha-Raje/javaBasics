package basics.binding;

/**
 * @author Aniruddha.Raje
 *
 */
public class StaticBinding {
	
	public static void main(String args[]) {

		StaticBinding d1 = new StaticBinding();
		d1.eat();
	}

	private void eat() {
		System.out.println("StaticBinding is eating...");
	}
}
