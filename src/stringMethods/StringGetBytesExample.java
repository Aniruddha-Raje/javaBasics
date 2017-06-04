package stringMethods;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="ABCDEFG";  
		byte[] barr=s1.getBytes();  
		
		for(int i=0;i<barr.length;i++){  
			System.out.println(barr[i]);  
		}  
	}

}
