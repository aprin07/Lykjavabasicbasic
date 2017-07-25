package tr.linux.kamp.deneme;

import java.util.Scanner;

public class Deneme {
	
	public static void main(String[] args) {
		
		//math. kütüphanesi bir çok matemetiksel işlem barındırır.
		
		System.out.println(Math.max(10, 5));
		System.out.println(Math.log10(Math.pow(10, 2)));
		
		//önce pow u sonra log u çalıştırır.
		
		
		/*
		 * m = a*b = n*n
		 * kök m > a||b
		 * 
		 * 
		 */

		
		////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		//prime number
		
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi gir:");
		int number = input.nextInt();
		boolean isPrime = false;
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number%i==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(number + " bir asal sayi");
			
		}
		
		else {
			System.out.println(number + " bir asal sayi değil");

			
		}
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
	}

}
 