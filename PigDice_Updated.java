package com.monocept.july19;

import java.util.Scanner;

public class PigDice {
	
	private int currentScore;
	private int turn;
	private int attempt;
	Scanner scanner;
	boolean game;
	
	public PigDice() {
		currentScore=0;
		turn=1;
		attempt=0;
		scanner=new Scanner(System.in);
		game=true;
	}
	
	public int dice() {
		return (int)(Math.random()*6+1);
	}
	
	public boolean checkMaxTurnAttempt() {
		if(this.attempt>15) {
			System.out.println("You Lost the Game");
			System.out.println("You have exceed the limit of allowed attempts");
			return false;
		}
		if(this.turn>8) {
			System.out.println("You Lost the Game");
			System.out.println("You have exceed the limit if allowd Turn");
			return false;
		}
		return true;
	}
	
	public boolean turnAttempt() {
		
		if(checkMaxTurnAttempt()) {
			
		    this.attempt++;
		    System.out.println("\nTurn: "+turn );
		    System.out.println("\nAttempt: "+attempt);
		    return true;
		}
		game=false;
		return false;
	}
	
	public boolean checkWin() {
		if(this.currentScore>=20) {
			System.out.println("Congratulations!! You Won The Game");
			
			System.out.println("If You Wanna Play Again press 1");
			System.out.println("If you want to exit then press 2");
			
			int playChoice=scanner.nextInt();
			if(playChoice!=1) {
				this.game=false;
			}
			return true;
		}
		return false;
	}
	
	public void diceRoll() {
		int diceNumber=dice();
		
		System.out.println("Dice: "+diceNumber);
		if(diceNumber==1) {
			this.currentScore=0;
			System.out.println("Turn Over | No Score");
			this.turn++;
			return ;
		}
		
		this.currentScore+=diceNumber;
		
		System.out.println("Your Score "+this.currentScore);
		checkWin();
		
	}
	
	public void diceHold() {
		
		System.out.println("You Hold the game");
		System.out.println("Your Score is "+this.currentScore);
		
		System.out.println("Do you wanna play again then Press 1");
		System.out.println("if you wanna Stop then press 2");
		
		int choice=scanner.nextInt();
		
		if(choice !=1) {
			game=false;
			return ;
		}
		this.turn++;
		
	}
	
	
	public void startGame() {
		
           while(game & turnAttempt()){
        	   
			         System.out.println("Hold or Roll (h/r)");
			         String choice=scanner.next();
			   
			         if(choice.equalsIgnoreCase("r")) {
				          this.diceRoll();
				          continue;
			         }
			         if(choice.equalsIgnoreCase("h")) {
			        	 this.diceHold();
			        	 continue;
			         }
			         System.out.println("Invalid choice");
			
		   }
           
           System.out.println("Game Over");
		
	}
	
	
	public static void main(String[]args) {
		
		System.out.println("============== Welcome to Pig Dice Game ===========================");
		System.out.println("There is maximum 15 attempts to win the game");
		System.out.println("There is maximum 8 turn to win the game");
		
		PigDice pigDice=new PigDice();
		
		pigDice.startGame();
		
	}

}
