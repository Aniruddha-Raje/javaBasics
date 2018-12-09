/**
 * 
 */
package basics.arrays;

/**
 * @author Aniruddha.Raje
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		
		int[] a = { 10, 9, 7, 101};
		int len = a.length;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}
	}
}
