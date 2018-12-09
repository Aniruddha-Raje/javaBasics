/**
 * 
 */
package basics.arrays;

import java.util.HashSet;

/**
 * @author Aniruddha.Raje
 *
 */
public class FindDuplicate {
	
	public static void main(String[] args) {
		
		String[] strArray = { "Java", "JSP", "Servlets", "Java", "JSP"};

		//Method 1
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				
				if ((strArray[i].equals(strArray[j])) && (i != j)) {
					System.out.println("Duplicate Found : " + strArray[j]);
				}
				
			}
		}
		
		//Method 2
		HashSet<String> set = new HashSet<>();
		  
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
	}
}
