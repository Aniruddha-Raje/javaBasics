/**
 * 
 */
package basics.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Aniruddha.Raje
 *
 */
public class Serialize implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;

	public Serialize(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Persist {
	public static void main(String args[]) throws Exception {
		Serialize s1 = new Serialize(211, "ravi");

		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}
}
