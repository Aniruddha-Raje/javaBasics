/**
 * 
 */
package basics.arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Aniruddha.Raje
 *
 */
public class FindCommonElementsFromArrays {

	public static void main(String[] args) {

		String[] inputArray1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
		String[] inputArray2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		// Mehtod 1
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < inputArray1.length; i++) {
			for (int j = 0; j < inputArray2.length; j++) {

				if (inputArray1[i].equals(inputArray2[j])) {
					set.add(inputArray1[i]);
				}
			}
		}

		System.out.println("First Array : " + Arrays.toString(inputArray1));
		System.out.println("Second Array : " + Arrays.toString(inputArray2));
		System.out.println("Common Elements : " + set);

		// Method 2
		HashSet<String> set1 = new HashSet<>(Arrays.asList(inputArray1));
		HashSet<String> set2 = new HashSet<>(Arrays.asList(inputArray2));
		set1.retainAll(set2);
		System.out.println("Common Elements by Method 2 : " + set1);
	}
}
