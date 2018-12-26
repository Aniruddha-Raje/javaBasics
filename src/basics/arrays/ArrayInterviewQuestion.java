/**
 * 
 */
package basics.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author Aniruddha.Raje
 *
 */
public class ArrayInterviewQuestion {
	
	public static void main(String[] args) {
		String [] strArr = {"A","C","B"};
		int [] intArr = {1,3,2};
		
		//Sort Array
		Arrays.sort(intArr);
		
		//Convert Array to List
		List<String> list = Arrays.asList(strArr);
		
		//Doesn't show 
		System.out.println("Int sorted array => \n");
		for(int temp : intArr) {
			System.out.println(temp);
		}
		
		//String to Array of Characters
		String str = "Hello";
		char [] charArr = str.toCharArray();
		for (char c : charArr) {
			System.out.println(c);
		}
		
		Arrays.sort(strArr);
		
		//Won't work
		System.out.println("\n"+strArr.toString());
		
		//Partially Works
		System.out.println("\n"+Arrays.toString(strArr).replaceAll(",","").trim());
		
		//Works
		StringBuilder sb = new StringBuilder();
		for (Object temp : strArr)
			sb.append(temp.toString());
		System.out.println("\n"+sb);
	}

}
