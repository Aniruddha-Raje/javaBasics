/**
 * 
 */
package basics.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Aniruddha.Raje
 *
 */
public class CovertArrayToListAndViceVerse {

	public static void main(String[] args) {
		String[] array = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		
		//Array to List
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		System.out.println(list);
		
		//List to Array
		String[] array2 = new String[list.size()];
		list.toArray(array2);
		
		for(String temp : array2) {
			System.out.println(temp);
		}
	}
}
