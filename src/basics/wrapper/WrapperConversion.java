/**
 * 
 */
package basics.wrapper;

/**
 * @author Aniruddha.Raje
 *
 */
public class WrapperConversion {

	public static void main(String[] args) {

		//1 bit | true or false
		boolean _boolean = false;
		
		//2 byte | 
		char _char = 'a';
		
		//1 byte | -128 to 127
		byte _byte = 0;
		
		//2 byte | -32,768 to 32,767
		short _short = 0;
		
		//4 byte | - 2,147,483,648 to 2,147,483,647
		int _int = 100;
		
		//8 byte | - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long _long = 0L;
		
		//4 byte
		float _float = 0.0f;
		
		//8 byte
		double _double = 0.0d;

		//Type mismatch
		//short s = _int;
		
		float f = _int;
		long l = _int;
		double d = _int;

		System.out.println("Float => " + f + "\nLong => " +  l + "\nDouble => " + d);
		
	}

}
