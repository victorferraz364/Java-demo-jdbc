package application;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		String names[] = {"Victor", "Ferraz", "Oliveira", "Caralho"};

		System.out.println(whoLikesIt(names));
	}
	
	  public static String whoLikesIt(String[] names) {
		  
	      if (names.length == 0) {
	        return "No one like this shit";
	      }
	      else if (names.length == 2) {
	    	  
	    	  return names[0] + " and " + names[1] + " like this";
	      }
	      
	      else if (names.length == 4) {
	    	  
	    	  return (names[0] + ", " + names[1] +  " and " + names[3] + " Like this");
	      }
	return "";
	      
	    }
	}


