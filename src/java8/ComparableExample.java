/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Aniruddha.Raje
 *
 */
public class ComparableExample {

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		System.out.println("====== Sorted by Age ======");
		al.forEach(st -> System.out.println(st.rollno + " " + st.name + " " + st.age));

		//al.sort((Student o1, Student o2)->o1.getRollno()-o2.getRollno());
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getRollno() - o2.getRollno();
			}
		});
		System.out.println("\n====== Sorted by Roll No ======");
		al.forEach(st -> System.out.println(st.rollno + " " + st.name + " " + st.age));

		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("\n====== Sorted by Name ======");
		al.forEach(st -> System.out.println(st.rollno + " " + st.name + " " + st.age));

	}
}

class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno
	 *            the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}
