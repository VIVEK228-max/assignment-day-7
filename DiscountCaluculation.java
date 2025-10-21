package Operatorsexamples;

import java.util.Scanner;

public class DiscountCaluculation {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount =s.nextInt();
		double discountAmount=(amount>=1000)?0.20:(amount>=500)?0.10:0.0;
		double discount=amount * discountAmount;
		double finalAmount=amount - discount;
		System.out.println("discount applied:" +(discountAmount*100) +"%");
		System.out.println("Discount amount:$" +discount);
		System.out.println("Final amount to pay:$" + finalAmount);
		s.close();
		
	}

}
