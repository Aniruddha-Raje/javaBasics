package basics.stringmethods;

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
		
		String str = new String("Hello");
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "Hello";
		
		//False
		if(str == str2) {
			System.out.println("str == str2");
		}
		//False
		if(str == str3) {
			System.out.println("str == str3");
		}
		//True
		if(str2 == str4) {
			System.out.println("str2 == str4");
		}
		
		//True
		System.out.println("str equals str2 => "+str.equals(str2));
		System.out.println("str equals str3 => "+str.equals(str3));
		
		//
		char[] charArr = s4.toCharArray();
	}

}
