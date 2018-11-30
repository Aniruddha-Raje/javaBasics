
package basics.string;

import java.lang.StringBuilder;


/**
 * @author Aniruddha.Raje
 *
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("a");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("Hello");  
		sb2.append("Java");
		sb.insert(5, "-");
		System.out.println(sb2);
	}
}
