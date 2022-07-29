package javaBasics2;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nunmber a : ");
		int a = sc.nextInt();
		System.out.println("Enter nunmber b : ");
		int b = sc.nextInt();
		
		 
		int temp = a;
		 a = b;
		 b = temp;
		
		System.out.println("swapped numbers :"+a+ " " +b);
	}

}
