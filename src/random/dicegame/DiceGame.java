package random.dicegame;

import java.util.Random;
import java.util.Scanner;


public class DiceGame {
    private static Random rgen = new Random();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Oyuncu 1'in ismini giriniz:");
        String user1 = sc.next();
        
        System.out.println("Oyuncu 2'nin ismini giriniz:");
        String user2 = sc.next();
        
        int dice1 = roll();
        int dice2 = roll();
        
        System.out.println(user1+ "'in zarı: " + dice1);
        System.out.println(user2+ "'in zarı:" + dice2);
        String winner = "";
        /*if(dice1 > dice2){
            winner = user1;
        }
        else if(dice1==dice2){
            winner = "Berabere";
        }
        else{
            winner = user2;
        }*/
        
        winner = (dice1 > dice2) ? user1 : (dice1 == dice2) ? "Berabere" : user2; 
        
        System.out.println("Kazanan:" + winner);
        
    }
    
    public static int roll(){
        return rgen.nextInt(6)+1;       
    }
}








	/*
		System.out.println(chooseDiceGame());

	}
	
	private static String chooseDiceGame() {
		return chooseRandomRank() + "of" + chooseRandomSuit();
	}
	
	private static String chooseRandomRank() {
		
		int randomNumber = rgen.nextInt(6)+1;

		switch(randomNumber) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		case 4:
			return 5;
		case 5:
			return 6;
		default :
			return "Hata";
	
		}
	}
	
		private static int chooseRandomSuit() {
	

			int randomNumber = rgen.nextInt(6)+1;

			switch(randomNumber) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 4;
			case 4:
				return 5;
			case 5:
				return 6;
			default :
				return "Hata";
			}
	
	
		}
		
		
	
}
*/
