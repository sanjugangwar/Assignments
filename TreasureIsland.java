package com.monocept.assignment1;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============== Welcome to Treasure Island Your mission is to find the treasure ================");
		
		System.out.print("Enter Your Choice left or right: ");
		
		Scanner scanner=new Scanner(System.in);
		
		String choice1=scanner.nextLine();
		
		if(choice1.equalsIgnoreCase("left")) {
			System.out.print("\nEnter Your Choice swim or wait: ");
			String choice2=scanner.nextLine();
			
			if(choice2.equalsIgnoreCase("wait")) {
				
				System.out.print("\nchoose the color of door blue or red or yellow: ");
				String choice3=scanner.nextLine();
				
				if(choice3.equalsIgnoreCase("red")) {
					
					System.out.println("Burned by fire Game Over.");
					
				}
				else if(choice3.equalsIgnoreCase("blue")) {
					
					System.out.println("Eaten by beasts Game Over");
					
				}
				else if(choice3.equalsIgnoreCase("yellow")) {
					System.out.println("You Win!");
				}
				else {
					System.out.println("Game Over");
				}
				
			}else {
				System.out.println("Attacked by trout Game Over.");
			}
			
		}
		else {
			System.out.println("Fall into a hole Game Over.");
		}

	}

}
