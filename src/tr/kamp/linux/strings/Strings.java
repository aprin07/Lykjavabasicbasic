package tr.kamp.linux.strings;

public class Strings {

	// str.toupperCase(); ------> string in içinde kini değiştirmek için kullanılır.

	// ch = Character.toUpperCase(ch); -----> character de metotları çağırmak (obje
	// tarafından) gerekir.

	/*
	 * concatenination : + operatörü .---> önce tüm işleme giren elemanlar için
	 * .toString methodu çağırılır. then .concat methodları ile birleştirilir.
	 */

	// print ("zar" + dice); ----> bu concatination örneğidir. print içinde string
	// oluşturulur.
	
	
	/* stringler için equals metodu ; karşılaştırma; 
       
    // alt stringleri alma ; 
     * str.substring(p1,p2) ile alt stringleri alabilirz.
     * p1 den istenen ilk elemanın index değeri
	   p2 den istenen sondan bir sonraki değerin index değeri
	   
	   string str = "hello world";
	   
	 // string içerisinde arama;
	  * System.out.println(str.substring(str.indexOf(''),str.length()));
	  * 
	  // strig in son harfi için ;
	   * System.out.println(str.charAt(str.length()-1));
// sondaki l ; System.out.println(str.lastindexOf('l'));


		System.out.println(str.substring(0,2)=="he");
*/
public static void main(String[] args) {
	   String str = "hello world";

	System.out.println(str.substring(0,2)=="he");
	System.out.println(str.substring(0,2).equals("he"));


}
	

}
