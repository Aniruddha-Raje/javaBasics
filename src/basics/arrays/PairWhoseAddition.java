/**
 * 
 */
package basics.arrays;

import java.util.Arrays;

/**
 * @author Aniruddha.Raje
 *
 */
public class PairWhoseAddition {

	public static void main(String[] args) {

		int[] inputArray = new int[] {4, 6, 5, -10, 8, 5, 20 };
		int inputNumber = 10;

		System.out.println("Input Array : " + Arrays.toString(inputArray));
		System.out.println("Input Number : " + inputNumber);
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				}
			}
		}
	}
}
