package Operatorsexamples;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int n = s.nextInt();
	        System.out.println((n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero");
	        System.out.println("number:" + n);
	        s.close();
	}

}
