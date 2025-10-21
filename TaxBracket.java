package Operatorsexamples;

import java.util.Scanner;

public class TaxBracket {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the income");
		double i =s.nextDouble();
		double tax;
		if (i< 300000) {
			tax =i *0.05;
		}else if (i <= 1000000) {
			tax = i*0.10;
		}else {
			tax = i *0.15;
		}
		if (i > 2000000) {
			tax += tax * 0.01;
		}
		System.out.printf("Total tax to be paid: %.2f%n",tax);
		s.close();
		
		

	}

}
