/**
 * 
 */
package basics.string;

/**
 * @author Aniruddha.Raje
 *
 */
public class InstanceOf extends Parent{

	public static void main(String[] args) {
		InstanceOf ob = new InstanceOf();
		
		//True
		System.out.println(ob instanceof InstanceOf);
		
		//True
		System.out.println(ob instanceof Parent);
	}
}

class Parent{
	
}
