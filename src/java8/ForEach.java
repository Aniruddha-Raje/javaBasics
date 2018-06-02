/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Aniruddha.Raje
 *
 */
public class ForEach {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("==========print without lambda expresssion==========");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		System.out.println("==========print Map with lambda expresssion==========");
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		List<String> items2 = new ArrayList<>();
		items2.add("A");
		items2.add("B");
		items2.add("C");
		items2.add("D");
		items2.add("E");

		System.out.println("==========Print String List without lambda expresssion==========");
		for (String temp : items2) {
			System.out.println(temp);
		}
		
		System.out.println("==========Print String List with forEach w/o method ref==========");
		items2.forEach(temp->System.out.println(temp));
		
		System.out.println("==========Print String List with forEach with method ref==========");
		items2.forEach(System.out::println);

	}
}
