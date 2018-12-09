package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Aniruddha.Raje
 *
 */
public class Fibonacci {

	public static void main(String[] args) throws Exception {
		CalcFibo obj = new CalcFibo();
		obj.getNumber();
	}
}

class CalcFibo{
	
	InputStreamReader isr;
	BufferedReader br;
	int firstNum, secondNum, thirdNum, i, len;
		
	void getNumber() throws Exception, Exception{
		
		isr = new InputStreamReader(System.in);  
		br = new BufferedReader(isr);  
		  
		System.out.println("Enter First Number: ");
		firstNum = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Fibo Limit: ");
		len = Integer.parseInt(br.readLine());
		
		calc(firstNum, len);
	}
	
	void calc(int firstNum, int len){
		
		secondNum = firstNum + 1;
		
		System.out.println(firstNum + " "+ secondNum);
		
		for(i = 2; i <= len; i++){
			thirdNum = firstNum + secondNum;
			
			System.out.println(thirdNum);
			
			firstNum = secondNum;
			secondNum = thirdNum;
		}
	}
	
	
}