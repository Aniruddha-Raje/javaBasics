package basics.string;

public class ImmutableString {
	public static void main(String[] args) {
		String s = "Sachin";  
		s.concat(" Tendulkar");//concat() method appends the string at the end  
		//s=s.concat(" Tendulkar"); 
		System.out.println(s);//will print Sachin because strings are immutable objects  

		String s1="Welcome";  
		String s2="Welcome";//will not create new instance  
		
		
		//Ways to create String
		String s3="java";//creating string by java string literal  
		
		char ch[]={'s','t','r','i','n','g','s'};  
		String s4=new String(ch);//converting char array to string  
		
		String s5=new String("example");//creating java string by new keyword  
		//Two objects created, one in string constant pool and other in non-pool(heap).

	}
}
