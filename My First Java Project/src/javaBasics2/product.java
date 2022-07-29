package javaBasics2;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First number is : ");
		int a = sc.nextInt();
		System.out.println("Second number is : ");
		int b = sc.nextInt();
		int product = a*b;
		
		System.out.println("Product is : " +product);
	}
	

}
