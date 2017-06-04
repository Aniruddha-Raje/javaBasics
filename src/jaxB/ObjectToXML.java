package jaxB;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ObjectToXML {
	public static void main(String[] args) {

		  marshaller();
		  unmarshaller();

		}
	
		static void marshaller(){
			
			Customers c= new Customers();
			List<Customer> customers = new ArrayList<Customer>();
			
			Customer customer = new Customer();
			customer.setId(1);
			customer.setName("Aniruddha");
			customer.setAge(24);
			
			Customer customer2 = new Customer();
			customer2.setId(2);
			customer2.setName("Hitesh");
			customer2.setAge(23);
			
			Customer customer3 = new Customer();
			customer3.setId(3);
			customer3.setName("Arti");
			customer3.setAge(28);
			
			Customer customer4 = new Customer();
			customer4.setId(4);
			customer4.setName("Anirban");
			customer4.setAge(32);
			
			customers.add(customer);
			customers.add(customer2);
			customers.add(customer3);
			customers.add(customer4);
			
			c.setCustomers(customers);
			  
			try {

				File file = new File("G:/xml/employees.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

				// output pretty printed
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

				jaxbMarshaller.marshal(c, file);
				jaxbMarshaller.marshal(c, System.out);

			} 
			catch (JAXBException e) {
			    	  e.printStackTrace();
			}
		}
		
		static void unmarshaller(){
			
			try {
				
				File file = new File("G:/xml/employees.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Customers customers = (Customers) jaxbUnmarshaller.unmarshal(file);

				System.out.println(customers);
				
				List<Customer> customer = customers.getCustomers();
				
				ListIterator<Customer> itr=customer.listIterator();  
				while(itr.hasNext()){  
					System.out.println(itr.next());  
				}  


			  } catch (JAXBException e) {
				e.printStackTrace();
			  }
		}
}
