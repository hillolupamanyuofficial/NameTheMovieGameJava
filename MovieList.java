package net.moviegame;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.*;

public class MovieList{
	
	ArrayList<String> movies = new ArrayList<String>();
	
	public MovieList()
	{
	
	try {
		File file = new File("movielist.txt");
		Scanner fileScanner = new Scanner(file);
		while(fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			movies.add(line);
		}
	    }catch(FileNotFoundException e) {
		System.out.println("Error!!File not present");
		e.printStackTrace();
	    
	    }
		
	    }
	
	  public String getRandom() {
		Random random = new Random();
		//System.out.println("Random movie is :");
		String returnRandomMovie = movies.get( random.nextInt(movies.size()) );
  
	   return returnRandomMovie;	
	}


}
	


