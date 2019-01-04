/**
 * 
 */
package basics;

/**
 * @author Aniruddha.Raje
 *
 */
public class MemoryManagement {

	public static void main(String[] args) {
		
		//Memory will be created on Heap for the class 
		//which will have Attributes & Methods compartments and an Address
		//ref will reside in Stack and will point to the class address
		MemoryManagement ref = new MemoryManagement();
		System.out.println(ref);
	}
}
