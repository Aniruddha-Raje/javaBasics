package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryToDecimal {

	public static void main(String[] args) throws Exception, NullPointerException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr;
		BufferedReader br;
		int num, result;
		
		isr = new InputStreamReader(System.in);  
		br = new BufferedReader(isr);  
		  
		System.out.println("Enter a Number");
		num = Integer.parseInt(br.readLine());
		
		result = toDecimal(num);
		System.out.println("Decimal conversion of : "+num+" is : "+result);
		
	}

	private static int toDecimal(int num) {
		
		int decimalnum = 0;
		int i = 1;
		int remainder;
		
		try{
			 
		    while (num != 0)
		    {
		        remainder = num % 10;
		        decimalnum = decimalnum + remainder * i;
		        i = i * 2;
		        num = num / 10;
		    }
			
		}
		catch(NullPointerException npe){
			System.out.println(npe);
		}
		return decimalnum;
		
	}

}