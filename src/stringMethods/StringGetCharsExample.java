package stringMethods;

public class StringGetCharsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("hello javatpoint how r u");  
	      char[] ch = new char[10];  
	      
	      try{  
	         str.getChars(6, 16, ch, 0);  
	         System.out.println(ch);  
	      }catch(Exception ex){
	    	  System.out.println(ex);
	      }  
	}

}
