package Operatorsexamples;

import java.util.Scanner;

public class BankAccountStatus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter balance");
		int h =s.nextInt();
		String result=(h>=1000)?"Good Standing":(h>=500 && h<=999)?"Low Balance":"Account overdrawn";
		System.out.println(result);
		s.close();
	}

}
