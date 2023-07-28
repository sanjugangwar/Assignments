package com.monocept.july5;

import java.util.Scanner;

public class Ride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============= start ================ ");
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Height ");
		int height=scanner.nextInt();
		
		if(height>120) {
			System.out.println("You Can Ride");
			
			System.out.println("Enter Your Age");
			int age=scanner.nextInt();
			
			int bill=0;
			if(age<12) {
				bill+=5;
				
			}
			else if(age>=12 && age<18) {
				bill+=7;
			}
			else if(age>18 && age<45) {
				bill+=12;
			}
			else {
				bill+=0;
			}
			System.out.println("Do you want photos ");
			String s=scanner.next();
			
			if(s.equalsIgnoreCase("Yes")) {
				bill+=3;
			}
			else {
				bill+=0;
			}
			
			System.out.println("Your final bill is "+bill);
			
		}
		else {
			System.out.println("Can't Ride");
		}

	}

}
