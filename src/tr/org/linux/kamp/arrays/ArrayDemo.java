//masaüstünde tamamı var


package tr.org.linux.kamp.arrays;

import java.util.Random;

public class ArrayDemo {
	
private static Random rand = new Random ();
private static int bound = 10;
private static int [] array = new int[bound];

	public static void main(String[] args) {
		
		generateArray();
		printArray();
		sortArray();
		
		System.out.print("sıralanmış dizi ");
		printArray();
		
		int item = 5;
		
		if(searchItem(item)) {
			System.out.println(item + " dizi içinde bulundu");
			
		}
		else {
			System.out.println(item + " izi elemanı bulunamadı");
		}
		int index = lastIndexOf(item);
		
		if( index != -1) {
			System.out.println(item + "elemanı" + index + ".indisde bulundu");
			
		}
		else {
			System.out.println("aranan eleman bulunamadı.");
			
		}
	}
		
		public static int lastIndexOf(int item) {
			for( int i =  (array.length -1) ; i>=0; i--) {
				if(array[i] == item) {
					return i;
					
				}
			
			
			
			}
			return -1;

	}

	
	
	private static boolean searchItem(int item) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == item) {
				return true;
			}
		}
		return false;
		
		
	}



	public static void generateArray() {
		int item;
		for(int i=0; i<array.length; i++) {
			item = rand.nextInt(10);
			array[i]=item;
		}
		
	}
	
	public static void printArray() {
	
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		}
	
	
	public static void sortArray() {
		for(int i=0; i<array.length; i++) {
			for(int j=1; j<array.length; j++) { // kensisiyle değil de bir sonraki le karşılAŞTIRMAK İÇİN 1 ALDIK
				if(array[j-1] < array[j]) {
				int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			// indisin içindeki değeri değiştirme işlemi "swap"
			}
		}
	}
	
	
	
	
}
