package tr.org.kamp.linux.prime;

	import java.util.Scanner;

	public class PrimeNumber {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("bir sayı giriniz : ");
			int count = input.nextInt();
			int loop = 0;
			int num = 2;
			boolean isPrime = true;
			while(loop < count) {
				isPrime = true;
				for(int i = 2 ; i < num ;i++) {
					if(num % i == 0) {
						isPrime = false;
						break;
						
					}
				}
				
				if(isPrime) {
					loop++;
					System.out.print(num + " ");
				}
				num++;
				
			}
					
		}
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		/*
	for(int i=0; i<50; i++) {
		if(i%2==0) {
			System.out.println("not prime");
		}
		if(i==2) {
			System.out.println("prime");
		}
		if(i==1) {
			System.out.println("not prime");
		}
	}
	*/
	
}

	
