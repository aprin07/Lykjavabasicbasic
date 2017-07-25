package tr.linux.kamp.deneme;

import java.util.Random;

public class RandomCard {
	static Random rgen = new Random();
	public static void main(String[] args) {
		

System.out.println(chooseRandomCard());

	}

	// Return the name of a randomly choosen card
	private static String chooseRandomCard() {
		return chooseRandomRank() + "of" + chooseRandomSuit();
	}

	// Return the name of a randomly choosen rank (Ace to King)
	// As,2,3,4,5,6,7,8,9,Vale,Kız,Papaz
	private static String chooseRandomRank() {
		// Your code starts here

		int randomNumber = rgen.nextInt(13)+1;   // 0 dan 12 ye kadar bir sayi
		
		/*
		 if(randomNumber > 1 && randomNumber <= 10) {
		 return "+randomNumber;
		 }
		 else{
		 switch(randomNumber) {
		case 1: 
			return "As";
			.
			.
			.
			.
			...
		
		  
		 */
		
		
		
		
		switch(randomNumber) {
		case 1: 
			return "As";
		/*
		case 2: 
			return "2";
		case 3:
			return "3";
		case 4: 
			return "4";
		case 5: 
			return "5";
		case 6: 
			return "6";
		case 7: 
			return "7";
		case 8: 
			return "8";
		case 9: 
			return "9";
		case 10: 
		*/
			
			
			 
		case 2: 
			
		case 3:
		case 4: 
		case 5: 
		case 6: 
		case 7: 
		case 8: 
		case 9: 
		case 10: 
			return ""+randomNumber;
			
		case 11: 
			return "Vale";
			
		case 12: 
			return "Kız";
		
		case 13:
			return "Papaz";
		default:
			return "Hata";
		}
		// Your code ends here
		
	}
	
	// Return the name of a randomly choosen suit (Clubs to Spades)
	// Karo, Maça, Sinek, Kupa

	private static String chooseRandomSuit() {
		
		// Your code starts here
		int randomNumber = rgen.nextInt(4);
		switch(randomNumber) {
		case 0: 
			return "Maça";
		case 1: 
			return "Kupa";
		case 2:
			return "Karo";
		case 3: 
			return "Sinek";
		default:
			return "Hata";
		// Your code ends here
	}
	}
}
