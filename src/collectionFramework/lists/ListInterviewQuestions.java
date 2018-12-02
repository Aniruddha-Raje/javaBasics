/**
 * 
 */
package collectionFramework.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Aniruddha.Raje
 *
 */
public class ListInterviewQuestions {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		
		//Can remove elements from ArrayList using index and obj
		list.remove(1);
		list.remove("c");
		
		//Can remove elements from LinkedList using index and obj
		list2.remove(1);
		list2.remove("3");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String temp = itr.next();
			System.out.println(temp);
		}
		
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()) {
			String temp = itr2.next();
			System.out.println(temp);
		}
	}

}
