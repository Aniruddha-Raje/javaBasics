package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aniruddha.Raje
 *
 */
public class Pallendrome {

	public static void main(String[] args) throws Exception {
		FindPallendrome obj = new FindPallendrome();
		obj.getNummber();
	}
}

class FindPallendrome {

	InputStreamReader isr;
	BufferedReader br;
	int num, temp, rem, rev;

	FindPallendrome() {
		rev = 0;
	}

	void getNummber() throws Exception, IOException {

		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);

		System.out.println("Enter a Number");
		num = Integer.parseInt(br.readLine());

		calcPallendrome(num);
	}

	void calcPallendrome(int num) {

		temp = num;

		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (temp == rev)
			System.out.println("Number " + temp + " is Pallendrome");
		else
			System.out.println("Number " + temp + " is NOT Pallendrome");
	}

}