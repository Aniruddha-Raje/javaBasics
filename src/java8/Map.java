/**
 * 
 */
package java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aniruddha.Raje
 *
 */
public class Map {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		// convert inside the map() method directly.
		List<Employee> result = listDevs.stream().filter(l -> l.getAge() > 30).map(temp -> {
			Employee obj = new Employee();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			return obj;
		}).collect(Collectors.toList());
		System.out.println(result);

		Map<Integer, String> result3 = listDevs.stream().collect(Collectors.toMap(x -> x.getAge(), x -> x.getName()));
		System.out.println("Result 3 : " + result3);

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