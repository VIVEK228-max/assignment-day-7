package Operatorsexamples;

import java.util.Scanner;

public class DayGreeting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Hour in 24hrs format:");
		int h= s.nextInt();
		String result=(h>=5 && h<12)?"Good Morning":(h>=12 && h<17)?"Good Afternoon":(h>=17 && h<22)?"Good Evening":"Good Night";
		System.out.println(result);
		s.close();
	}

}
