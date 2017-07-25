package tr.org.linux.kamp.FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		
		
		for(int i=0; i<50; i++) {
			if( i%3==0) {
				System.out.println("i = fizz");
			}
			
			if( i%5==0) {
				System.out.println("i = buzz");
			}
			
			if( i%15==0) {
				System.out.println("i = fizzbuzz");
			}
		}
	}
}
