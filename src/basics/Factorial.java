package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Fact obj = new Fact();
		obj.getNumber();
		
	}

}

class Fact{
	
	InputStreamReader isr;
	BufferedReader br;
	int num, n, i, fact;
	
	Fact(){
		n = i = fact = 1;
		
	}
	
	void getNumber() throws IOException{
		isr = new InputStreamReader(System.in);  
		br = new BufferedReader(isr);  
		  
		System.out.println("Enter a Number");
		num = Integer.parseInt(br.readLine());
		
		calcFact(num);
	}
	
	void calcFact(int num){
		
		while(i <= num){
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of "+num+" is "+ fact);  
		  
	}
}
