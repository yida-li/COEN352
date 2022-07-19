/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yida.project0003;

/**
 *
 * @author nakamoto
 */
import java.util.Scanner; 
import java.util.Random;

public class App {

public static void main(String[] args) {
    
    //initialize java objects
    Scanner myScanner = new Scanner(System.in);
    Random randomizer = new Random();
    

    //initialize variables
    int choice = 0;  
    int rounds =0;
    int userScore=0;
    int computerScore=0;
    boolean flag=true;
    String rockPaperScissor = "";
    String playAgain = "";

    
    
    while(true){
    //resets userScore and computerScore and flag for playing again    
    userScore=0;
    computerScore=0;
    flag=true;

   
    try {
            System.out.println("Please enter number between 1 and 10: ");

            String input = myScanner.nextLine();
            int number = Integer.parseInt(input);
          
            if (number >= 1 && number <= 10) {
                rounds=number;
            }
            else{
                System.out.println("Error! Program Terminating......");
                System.exit(0);    
            }

        } catch(NumberFormatException ex) {
            System.out.println("Error! Program Terminating......");
            System.exit(0);

        }





    System.out.println("The game will go through "+rounds+"rounds");
    System.out.println("Start:");

    int counter=rounds;
    // the number of rounds to play
    while(counter>0){
    //decrement during each iteration
    counter--;
    int randomRoll = randomizer.nextInt(3) + 1;
    

    System.out.println("Please make your choice:");
    System.out.println("1 for rock, 2 for paper, 3 for scissors :");

    rockPaperScissor = myScanner.nextLine();
    choice = Integer.parseInt(rockPaperScissor);
    while(choice!=1 && choice !=2 && choice!=3){
        System.out.println("\nError! Please enter either 1 or 2 or 3!\n");
        rockPaperScissor = myScanner.nextLine();
        choice = Integer.parseInt(rockPaperScissor);
    }

        switch (randomRoll) {
            case 1:
                System.out.println("Computer rolled rock:");
                break;
            case 2:
                System.out.println("Computer rolled paper:");
                break;
            default:
                System.out.println("Computer rolled scissors :");
                break;
        }
    
    
    
    if (choice==randomRoll){
        System.out.println("its a tie this round\n\n");   
    }
    else if(choice==1 && randomRoll==3){
        System.out.println("You win this round\n\n");
        userScore+=1;
    }
    else if(choice<randomRoll){
        System.out.println("You lose this round\n\n");
        computerScore+=1;
    }
    else if(choice==3 && randomRoll==1){
        System.out.println("You lose this round\n\n");
        computerScore+=1;
    }
    else{
        System.out.println("You win this round\n\n");
        userScore+=1;
    }
    }
    
    

    //The program must print out the number of ties, user wins, 
    //and computer wins and declare the overall winner based on who won more rounds.
    System.out.println("Total amount of rounds tied :"+(rounds-(userScore+computerScore)));
    System.out.println("Total amount of rounds you have won :"+(userScore));
    System.out.println("Total amount of rounds computer has won :"+(computerScore));
    if(userScore==computerScore){
        System.out.println("\nIt is a tie, you both are winners");
    }
    else if(userScore>computerScore){
        System.out.println("\nYou are the overall winner");
    }
    else{
        System.out.println("\nThe computer is the overall winner");
    }

    

    


    //After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
    System.out.println("Would you like to play again? Enter Yes or No"); 
    while(flag){
    playAgain = myScanner.nextLine();
    if("No".equals(playAgain)){
        myScanner.close();
        System.exit(0);
    }
    else if("Yes".equals(playAgain)){ 
        flag=false;
    }
    else{
        System.out.println("Please enter either Yes or No");
    }
    }
    }
    
}
}
