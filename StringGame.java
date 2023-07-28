package com.monocept.homeassignmentjuly7;

import java.util.Scanner;

public class StringGame {
	
	public static int printStr(char[]gameString,int size) {
		
        System.out.println();
        
        int foundedWord=0;
		
		for(int i=0;i<size;i++) {
			
			if(gameString[i]=='\0') {
				
				System.out.print('_'+" ");
				
			}
			else {
				
				foundedWord++;
				System.out.print(gameString[i]);
				System.out.print(' ');
				
			}
			
		}
		
		System.out.println();
		
		return foundedWord;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String charString="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		Scanner scanner=new Scanner(System.in);
		
		int size=(int)(Math.random()*10)+1;
		
		char [] string=new char[size];
		char [] gameString=new char[size];
		
		int foundedWord=0;//to track the words in the String
		
		for(int i=0;i<size;i++) {
			int ind=(int)(Math.random()*size);
			ind=ind%size;
			string[i]=charString.charAt(ind);
		}
		
		System.out.print("Your Random Generated String: ");
		
		for(int i=0;i<string.length;i++) {
			System.out.print(string[i]);
		}
		
		int randomValue=(int)(Math.random()*3);
		
		if(randomValue<2) {
			randomValue=2;
		}
		
		for(int i=0;i<randomValue;i++) {
			
			int ind=(int)(Math.random()*size);
			ind=ind%size;
			gameString[ind]=string[ind];
			
		}
		
		foundedWord=printStr(gameString,size);
		
		System.out.println();
		while(foundedWord!=size) {
			
			System.out.println("guess a character");
			char inputChar=scanner.next().charAt(0);
			
			if(inputChar >'a' && inputChar <'z' ) {
				Character character = inputChar;
				inputChar=character.toUpperCase(inputChar);
			}
			
			boolean found=true;
			
			for(int i=0;i<string.length;i++) {
				if(string[i]==inputChar && gameString[i]=='\0') {
					gameString[i]=inputChar;
					
					foundedWord=printStr(gameString,size);
					found=false;
					break;
				}
			}
			
			if(found) {
				System.out.println("Character Not Found in game , please choose again");
			}
			
		}
		
		System.out.println("\n You Won The Game \n");
		
		for(int i=0;i<size;i++) {
			System.out.print(string[i]);
		}
		
		
	}

}
