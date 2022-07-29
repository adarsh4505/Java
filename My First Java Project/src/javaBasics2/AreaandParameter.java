package javaBasics2;

import java.util.Scanner;

public class AreaandParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double Pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius of the circle is : ");
		int r = sc.nextInt();
		int area = r*r;
		System.out.println("Area of circle is:"+area);
		double parameter = 2*Pi*r;
		System.out.println("Parameter or circumference of circle is : "+parameter);
		
	}

}
 