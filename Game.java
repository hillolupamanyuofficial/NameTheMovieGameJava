package net.moviegame;
import net.moviegame.MovieList;
//here is when i start

public class Game {
	
	public boolean gameWon ;
	public static int chances = 0;
	String wrongChar ;
	
	public Game() {
		boolean gameWon = false;
		wrongChar = "";
	}
	
	
	public char[] putMovieInArray() {
		MovieList movieList = new MovieList();
		String randomMovie = movieList.getRandom();
		randomMovie = randomMovie.toLowerCase();  //lowercasing the randommovie
		//System.out.println(randomMovie); //printing the name
	char[] actualMovie = new char[randomMovie.length()];  //should be kept private
	for(int i=0;i<randomMovie.length();i++) {
		
		actualMovie[i] = randomMovie.charAt(i);    //make it private later
	}
	

	
	return actualMovie;
	}
	
	public char[] changeMovieToUnderscore(char[] array) {
		char[] guessMovie = new char[array.length];
		for(int i=0;i<array.length;i++) {
			if(array[i] == ' ') {
				guessMovie[i] = ' ';
			}
			else {
		guessMovie[i] = '-';
		}
		}
		return guessMovie;
	}
	
    public char[] checkForCommon(char checkChar,char [] arrayUnder,char[] arrayActual) {
     int count = 0;
	for(int i=0;i<arrayActual.length;i++) {
	 if(arrayActual[i] == checkChar) {
		 arrayUnder[i] = checkChar;
		 count++;
	     }

		  
	    }
	  
	if(count == 0) {
		 ++chances;
		 wrongChar  += checkChar ;
		 wrongChar = wrongChar + "," ;
		 
	}

     	
		 System.out.println("You have guessed ("+ chances + ") wrong letters :" + wrongChar);

	 return arrayUnder;
    }
}