import java.util.Scanner;

class PigDice{

    public static int rollDice(){
        return (int)(Math.random()*6)+1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("========================Welcome to pig dice game =============================");
        System.out.println("Maximum attempt you can take is 15");
        System.out.println("maximum turn you can take is 8");
        int currentScore=0,turn=1,attempt=0;
        Boolean newTurn=true,finalAttempt=false;
       
        while(true){

            if(currentScore>=20){
                System.out.println("Congratulations!!!!!!!!!! \nYou won the game \nTurn "+turn+" \nattempt take "+attempt);
                System.out.println("Do you Wanna Play Again ? \nPress 1 for play again \nPress 2 for Stop");
                int afterWinChoice=scanner.nextInt();
                if(afterWinChoice!=1){
                    return ;
                }
                turn=1;
                attempt=0;
                currentScore=0;
                newTurn=true;
            }

            if(finalAttempt){

                if(currentScore<20 || turn>8 || attempt>15){
                    System.out.println("Sorry you have lost the game");
                    
                    if(turn>8){
                        System.out.println("Your have tried for maximum turn ");
                        return ;
                    }

                    if(attempt>15){
                        System.out.println("You have tried for maximum attempt ");
                        return ;
                    }

                    System.out.println("You Hold the game");
                    System.out.println("Turn Used "+turn);
                    System.out.println("Attempt Used "+attempt);
                    return;

                }
                
            }

            attempt++;
        

            if(newTurn){
                System.out.println("\nTURN "+turn);
                newTurn=false;
            }

            System.out.println("\nAttempt Number "+attempt);

            System.out.println("roll or hold (r/h)?");
            String choice=scanner.next();

            if(choice.equalsIgnoreCase("r")){
                int diceNumber=rollDice();
                System.out.println("Dice "+diceNumber);
                if(diceNumber==1){
                    currentScore=0;
                    newTurn=true;
                    System.out.println("Turn Over | No Score ");
                    turn++;
                }
                else{
                    currentScore+=diceNumber;
                }
            }
            else{
                newTurn=true;
                System.out.println("Score For TURN "+turn);
                turn++;
                System.out.println("Your Score "+currentScore);
                System.out.println("Do You Wanna Resume? \nplease press 1 for resume \nPlease press 2 for hold the game");
                int holdChoice=scanner.nextInt();
                if(holdChoice!=1){
                    finalAttempt=true;
                }
            }
            
        }
    }
}