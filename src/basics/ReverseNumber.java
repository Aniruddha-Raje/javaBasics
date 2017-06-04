package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		Reverse obj = new Reverse();
		obj.getNummber();
	}

}

class Reverse{
	
	int num, temp, rem, rev;
	InputStreamReader isr;
	BufferedReader br;
	
	Reverse(){
		rev = 0;
	}
	
	void getNummber() throws Exception, IOException{
		
		isr = new InputStreamReader(System.in);  
		br = new BufferedReader(isr);  
		  
		System.out.println("Enter a Number");
		num = Integer.parseInt(br.readLine());
		
		makeReverse(num);
	}
	
	void makeReverse(int num){
		
		temp = num;
		
		while(num > 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		
		System.out.println("Reverse of "+temp +" is "+rev);
	}
	
}