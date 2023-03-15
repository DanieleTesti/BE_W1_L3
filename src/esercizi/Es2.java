package esercizi;

import java.util.Scanner;

public class Es2 {

	Scanner s = new Scanner(System.in);

	    int number;

	    public void Switch() {

	            System.out.println("inserisci un numero");
	            number= s.nextInt();
	            switch(number) {
	            case 0:
	                System.out.println("zero");
	                break;
	            case 1:
	                System.out.println("uno");
	                break;
	            case 2:
	                System.out.println("due");
	                break;
	            case 3:
	                System.out.println("tre");
	                break;
	            default :
	                System.out.println("error");

	        }
	    }


	    String myString;
	    
	    public void While() {
	        do {
	            System.out.println("inserisci una stringa");
	            myString= s.next();
	            String[] letters = myString.split("");
	            System.out.println(String.join(",", letters));

	        }while(myString !="q");
	        System.out.println("FINITO");
	    }
	    
	    
	    int n;

	    public void ContoAllaRovescia() {

	        for(int i = 0; i < 2; i++) {

	            System.out.println("Inserisci un numero: ");
	            n = s.nextInt();

	            for(int j=number; j>0; j--) {
	                System.out.println(j);
	            }
	        }
	    }
	    
}
	    
	    
