package jaxB;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {

	
	List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

//	@XmlElement
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
