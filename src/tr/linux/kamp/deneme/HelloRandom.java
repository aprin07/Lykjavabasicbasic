package tr.linux.kamp.deneme;

import java.util.Random;

public class HelloRandom {

	public static void main(String[] args) {
		
		System.out.println("Math random: " + Math.random());
		Random rgen = new Random();
		System.out.println("Rgen1 Random next int: " + rgen.nextInt());

		
		/*
		System.out.println("Rgen Random next int: " + rgen.nextInt());
		System.out.println("Rgen Random next double: " + rgen.nextDouble());
		System.out.println("Rgen Random next boolean: " + rgen.nextBoolean());
*/
		//System.out.println("Rgen2 Random next int: " + rgen2.nextInt());

		//inclusive = dahil
		//0 dahil 5 dahil değil.
		
		int result = rgen.nextInt(3)+8;
		System.out.println("Rgen Random next int between 0-5: " + rgen.nextInt(100));

	}
}
