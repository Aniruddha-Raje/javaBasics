package basics.string;

/*
 A string that can be modified or changed is known as mutable string. 
 StringBuffer and StringBuilder classes are used for creating mutable string.
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");
		System.out.println(sb.capacity());//now 16
		
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java
		
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello Java
		
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavavaello Java
		
		sb.delete(1,3);  
		System.out.println(sb);//prints Hvavaello Java
		
		sb.reverse();  
		System.out.println(sb);//prints avaJ olleavavH
		
		System.out.println(sb.capacity());//now 16  
	}
}
