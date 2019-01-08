package jaxB;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Aniruddha.Raje
 *
 */
@XmlRootElement
public class Customers {

	List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
