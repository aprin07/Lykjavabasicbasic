package tr.org.linux.kamp.arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		String[] myStringArray = new String[3];
		String[] myAnotherStringArray = {}; //null yazsam da olur.
		String[] myAnotherAnotherStringArray = {"Yavuz Çetin", "Kerim Çaplı"};
		
		System.out.println(myAnotherAnotherStringArray[1]);
	}

}
