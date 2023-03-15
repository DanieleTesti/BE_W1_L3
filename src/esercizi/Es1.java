package esercizi;

import java.util.Scanner;

public class Es1 {

	Scanner s = new Scanner(System.in);
	boolean numberOfCaracters;
	String myString;

	public void pariDispari() {

		System.out.println("inserisci una stringa");
		myString = s.next();
		if (myString.length() % 2 == 0) {
			numberOfCaracters = true;
			System.out.println("il numero è pari?: " + numberOfCaracters);
		} else {
			numberOfCaracters = false;
			System.out.println("il numero è pari?: " + numberOfCaracters);
		}

	}

	    boolean isBisestile;
	    int anno;


	public void annoBisestile() {
		// TODO Auto-generated method stub
    	System.out.println("inserisci un anno");
    	anno= s.nextInt();
    	if((anno%4==0) || ( (anno%100==0) && (anno%400==0) )) {
    		isBisestile = true;
    		System.out.println("l'anno è bisestile?: " + isBisestile);
    	}else {
    		isBisestile = false;
    		System.out.println("l'anno è bisestile?: " + isBisestile);
    	}
	}




	}
