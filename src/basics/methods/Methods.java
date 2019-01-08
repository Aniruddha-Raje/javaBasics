package basics.methods;

/**
 * @author Aniruddha.Raje
 *
 */
public class Methods {
	
	public static void main(String[] args) {
		// Number methods

		// Max
		System.out.println("Math.max => " + Math.max(12.123, 12.456));

		// Min
		System.out.println("Math.min => " + Math.min(23.12, 23.0));

		// Random
		System.out.println("Math.random => " + Math.random() * 100);

		// Round
		float g = 90f;
		System.out.println("Math.round => " + Math.round(g));

		// Parse Int
		int b = Integer.parseInt("444");
		System.out.println("parseInt => " + b);

		// toString
		Integer x = 5;
		System.out.println("toString => " + x.toString());

		// Equals
		Integer aa = 5;
		Integer bb = 10;
		System.out.println("5 equals 10 => " + aa.equals(bb));

		// compareTo
		Integer cc = 5;
		System.out.println(cc.compareTo(3));
		System.out.println(cc.compareTo(5));
	}
}
