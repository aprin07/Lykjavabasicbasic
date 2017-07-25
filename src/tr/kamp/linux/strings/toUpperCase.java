package tr.kamp.linux.strings;

public class toUpperCase {
	
	//touppercase ispalindrome ve reverse string emailvalid bak

	public static void main(String[] args) {
		
		String str = null;
		/* string sınıfındaki ile aynı işlemi yapacak 
		character sınıfını kullanarak kendi
		toUpperCase kodumuzu yazma:
			*/
		System.out.println(ourToUpperCase(str).equals(str.toUpperCase()));;
		
		
	}
	
	public static String ourToUpperCase(String str) {
		String result = "";
		for(int i=0; i< str.length(); i++) {
			result += Character.toUpperCase(str.charAt(i));
			
		}
		return result;
	}
}
