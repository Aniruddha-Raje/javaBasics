/**
 * 
 */
package basics.arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Aniruddha.Raje
 *
 */
public class CountElementOccurrences {

	public static void main(String[] args) {

		int[] inputArray = { 4, 5, 4, 5, 4, 6 };

		HashMap<Integer, Integer> map = new HashMap<>();

		// checking every element of the inputArray
		for (int i : inputArray) {

			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println("Input Array : " + Arrays.toString(inputArray));
		System.out.println("Element Count : " + map);
	}
}
