/**
 * 
 */
package collectionFramework.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Aniruddha.Raje
 *
 */
//Vector doubles its array size
//ArrayList grow 50% of its size
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
		
		String data = getData();
		System.out.println(data);
		
		List<String> l = new ArrayList<>(2);
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println(l.size());
		
	}
	
	private static String getData() {
		return "ok";
	}

}
