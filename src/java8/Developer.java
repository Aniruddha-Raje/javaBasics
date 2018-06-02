/**
 * 
 */
package java8;

import java.math.BigDecimal;

/**
 * @author Aniruddha.Raje
 *
 */
class Developer {

	private String name;
	private BigDecimal sal;
	private int age;

	/**
	 * @param name
	 * @param sal
	 * @param age
	 */
	public Developer(String name, BigDecimal sal, int age) {
		super();
		this.name = name;
		this.sal = sal;
		this.age = age;
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
	 * @return the sal
	 */
	public BigDecimal getSal() {
		return sal;
	}

	/**
	 * @param sal
	 *            the sal to set
	 */
	public void setSal(BigDecimal sal) {
		this.sal = sal;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Developer [name=" + name + ", sal=" + sal + ", age=" + age + "]";
	}

}
