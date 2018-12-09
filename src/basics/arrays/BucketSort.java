/**
 * 
 */
package basics.arrays;

/**
 * @author Aniruddha.Raje
 *
 */
public class BucketSort {

	public static void main(String[] args) {

		int i, j;
		int[] array = {90, 23, 101, 45};
		int len = array.length;
		
		int count[] = {};
		
		for (i = 0; i < len; i++)
			count[i] = 0;

		for (i = 0; i < len; i++)
			(count[array[i]])++;

		for (i = 0, j = 0; i < len; i++)
			for (; count[i] > 0; (count[i])--)
				array[j++] = i;
		
		for(int temp : array) {
			System.out.println(temp);
		}

	}

}
