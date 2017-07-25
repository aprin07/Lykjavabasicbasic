package tr.linux.kamp.deneme;

import java.util.Scanner;

public class sphere {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("yaricapi giriniz:");
		double radius = input.nextInt();
		
		System.out.println("Hacim: " + volume());

	}
	
	public static double volume() {
		
		double resultH = Math.PI;
		
		return resultH;
		
	}
}
