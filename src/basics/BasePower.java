package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Aniruddha.Raje
 *
 */
public class BasePower {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CalculateBasePower obj = new CalculateBasePower();
		obj.getNumbers();
	}

}

class CalculateBasePower{
	
	int base, power, ans, i;
	InputStreamReader isr;
	BufferedReader br;
	
	CalculateBasePower(){
		ans = 1;
	}
	
	void getNumbers() throws Exception, Exception{
		isr = new InputStreamReader(System.in);  
		br = new BufferedReader(isr);  
		  
		System.out.println("Enter Base: ");
		base = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Power: ");
		power = Integer.parseInt(br.readLine());
		
		calcBasePower(base, power);
	}
	
	void calcBasePower(int base, int power){
		
		for(i=1; i<= power; i++){
			ans = ans * base;
		}
		
		System.out.println("Answer is: "+ ans);
	}
}