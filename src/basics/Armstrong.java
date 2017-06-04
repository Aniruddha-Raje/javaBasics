package basics;

public class Armstrong {

	public static void main(String[] args) {		
		for(int i = 0 ; i < 10000000; i ++) {
			if(isAmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isAmstrong(int number) {
		int power = (""+number).length();
		int sum = 0;
		int temp = number;		
		
		while (temp > 0) {
			int rem = temp % 10;
			int pow = 1;
			for(int i = 0; i< power; i++){
				pow = pow * rem ;
			}
			sum += pow;
			temp = temp / 10;
		}
		return sum == number;
	}

}

/*class FindArmstrong {
	int temp, rem, sum;

	FindArmstrong() {
		sum = 0;
	}// constructor

	void displayArmstrong() {

		for (int i = 1; i <= 1000; i++) {
			temp = i;

			while (temp > 0) {
				rem = temp % 10;
				sum = sum + (rem * rem * rem);
				temp = temp / 10;
			}

			if (sum == i) {
				System.out.println("The Numremer " + i + " is Armstrong Number");
			}

			sum = 0;

		}
	}// displayArmstrong
}
*/