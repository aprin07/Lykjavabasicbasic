package tr.linux.kamp.deneme;

import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("1. kenarı giriniz:");
		double kenar1 = input.nextInt();

		System.out.println("2. kenarı giriniz:");
		double kenar2 = input.nextInt();

		System.out.println("Hipotenus" + hipotenus(kenar1, kenar2));
		System.out.println("Area" + area(kenar1, kenar2));
		System.out.println("Perimeter" + perimeter(kenar1, kenar2));
	}

	public static double hipotenus(double kenar1, double kenar2) {

		double resultH = Math.hypot(kenar1, kenar2);

		return resultH;
	}

	public static double area(double kenar1, double kenar2) {

		double resultA = (kenar1 * kenar2)/2;

		return resultA;
	}

	public static double perimeter(double kenar1, double kenar2) {

		double resultP = (kenar1 + kenar2 + hipotenus(kenar1, kenar2) );

		return resultP;
	}
}
