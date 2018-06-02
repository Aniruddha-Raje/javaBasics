package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Aniruddha.Raje
 *
 */
public class Sorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("==============Before Sort==============");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		//sort by name	
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("==============After Sort by name==============");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
					
		//sort by salary
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSal().compareTo(o2.getSal());
			}
		});		
		System.out.println("==============After Sort by salary==============");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		System.out.println("==============After Sort by Age by Lambda expression ==============");
		//lambda sort by age!
		listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
		listDevs.forEach((developer)->System.out.println(developer));
		
		System.out.println("==============After Sort by Name by Lambda expression ==============");
		//lambda sort by name!
		listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));
		listDevs.forEach((developer)->System.out.println(developer));
		
		System.out.println("==============After Sort by Sal by Lambda expression ==============");
		System.out.println("==============Parameter type is optional==============");
		//lambda sort by sal!
		listDevs.sort((o1, o2)->o1.getSal().compareTo(o2.getSal()));	
		listDevs.forEach((developer)->System.out.println(developer));

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}