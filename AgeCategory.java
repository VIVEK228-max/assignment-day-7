package Operatorsexamples;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		int age= s.nextInt();
		String category=(age<=12)?"teenager":(age<=19)?"Adult":(age<=64)?"senior":"old age";
		System.out.println("Age group:" + category);
		s.close();
	}

}
