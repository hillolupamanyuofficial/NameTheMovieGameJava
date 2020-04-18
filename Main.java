package net.moviegame;
import java.util.*;
import net.moviegame.*;
public class Main {
//here is where i start
	public static void main(String[] args) {
		
		System.out.println("Welcome to Guess the movie Game!!!");
		System.out.println("Please read the instructions before playing");
		System.out.println("And your Game Starts now!!!");
		System.out.println("");
		
		Game game = new Game();
		char[] keepActualMovie = game.putMovieInArray();
//        System.out.println(keepActualMovie);//printing the movie second time
        char[] showInUnderScore=game.changeMovieToUnderscore(keepActualMovie);
        System.out.print("You are Guessing : ");
        System.out.println(showInUnderScore);
 
        while(game.gameWon == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("guess a letter : ");
            char guessChar = scanner.next().charAt(0);
             guessChar = Character.toLowerCase(guessChar); //lowercase input
        	
        	showInUnderScore = game.checkForCommon(guessChar,showInUnderScore,keepActualMovie);
        	System.out.println(showInUnderScore);
 	
        	if(Arrays.equals(showInUnderScore,keepActualMovie)) {
        		game.gameWon = true;
        		System.out.println("Congrats You have won the game :) !!!");
        	}
   
        	if(game.chances == 10) {
        		
        		System.out.println("All your Chances are over! YOU LOST!!!!");
   			    System.out.println("The name of the movie is :" + keepActualMovie);
        		break;
        	}
        }
        
	}



	}


