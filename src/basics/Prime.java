package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aniruddha.Raje
 *
 */
public class Prime {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		
		CheckPrime obj = new CheckPrime();
		obj.getNumber();
	}

}

class CheckPrime{
	
	InputStreamReader isr;
	BufferedReader br;
	int num, i, rem, flag;
	
	CheckPrime(){
		i =2;
		flag = 0;
	}
	
	void getNumber() throws Exception, IOException{
		
		isr = new InputStreamReader(System.in);  
		br = new BufferedReader(isr);  
		  
		System.out.println("Enter a Number");
		num = Integer.parseInt(br.readLine());
		
		calculate(num);
	}
	
	void calculate(int num){
		
		for( ; i< num; i++){
			rem = num % i;
			
			if(rem == 0)
				flag = 1;
		}
		
		if(flag == 0)
			System.out.println("The Number "+num+" is Prime");
		else 
			System.out.println("The Number "+num+" is NOT Prime");
	}
	
}