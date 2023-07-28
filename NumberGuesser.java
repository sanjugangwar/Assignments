package com.monocept.homeassignments.july5;

import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=========================== Welcome to Number Guesser Game ======================");
		
		int choice;
		boolean restartFlag=false;
		Scanner scanner=new Scanner(System.in);
		
		do {
			
			if(restartFlag) {
				System.out.println("Press 2 to restart the game");
			}
			else {
				System.out.println("Press 1 to start the game");
			}
			
			restartFlag=true;
			System.out.println("Press 3 to exit from the game");
			
			System.out.print("Enter your choice :");
			choice =scanner.nextInt();
			
			if(choice==1 || choice ==2) {
				if(choice==2) {
					System.out.println("Restarting the game");
				}
				
				int randomNumber=(int)(Math.random()*100)+1;
				System.out.println("Random generated number is:"+randomNumber);
				
				int attempt=0;
				while(true) {
					attempt++;
					
					System.out.print("Guess the number: ");
					int guessedNumber=scanner.nextInt();
					if(guessedNumber<0 || guessedNumber>100) {
						System.out.println("Please enter between 1 to 100");
					}
					else if(guessedNumber<randomNumber) {
						System.out.println("Sorry! too Low");
					}
					else if(guessedNumber>randomNumber) {
						System.out.println("Sorry! too high");
					}
					else {
						System.out.println("You won the game"+"\n Attempt take:"+attempt);
						break;
					}
				}
				
			}
			
			
			
		}while(choice !=3);
		
		System.out.println("Game End");

	}

}
