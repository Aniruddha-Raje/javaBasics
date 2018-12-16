package basics.string;

public class StringInterviewQuestions {

	public static void main(String[] args) {
		//Strings are immutable, so we can’t change it’s value in program. 
		//Hence it’s thread-safe and can be safely used in multi-threaded environment.

		String s1="javatpoint";
		String s2="javatpoint";
		String s3="JAVATPOINT";
		String s4="python";
		
		//Reverse the String
		//String class doesn’t provide any method to reverse the String 
		//but StringBuffer and StringBuilder class has reverse method
        StringBuilder strBuilder = new StringBuilder(s4);
        strBuilder.reverse();
		
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same
		System.out.println("\n");
		
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "Hello";
		
		//False
		//Compares references
		if(str1 == str2) {
			System.out.println("str == str2");
		}
		//False
		if(str1 == str3) {
			System.out.println("str1 == str3");
		}
		//False
		if(str2 == str3) {
			System.out.println("str2 == str3");
		}
		//True
		if(str2 == str4) {
			System.out.println("str2 == str4");
		}
		
		//True
		//Compares values
		System.out.println("\nstr equals str2 => "+str1.equals(str2));
		System.out.println("str equals str3 => "+str1.equals(str3));
		System.out.println("str2 equals str3 => "+str2.equals(str3));
		
		//To split a String into character array
		char[] charArr = s4.toCharArray();
		
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println("\nObject equals => "+o1.equals(o2));
		
		String string1 = new String();
		String string2 = new String();
		System.out.println("String equals => "+string1.equals(string2));
		
	}

}
