package basics;

/**
 * @author Aniruddha.Raje
 *
 */
public class StringBufferAndBuilder {

	public static void main(String[] args) {
		// String is immutable
		// StringBuffer and StringBuilder are mutable
		// StringBuffer is threadsafe

		long startTime = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer("Java");

		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}

		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();

		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}

		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
