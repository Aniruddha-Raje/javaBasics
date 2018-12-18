package basics.dataStructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Aniruddha.Raje
 *
 */
public class EnumerationDemo {
	public static void main(String args[]) {

		Vector<String> dayNames = new Vector<>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		Enumeration<String> days = dayNames.elements();

		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}
}
