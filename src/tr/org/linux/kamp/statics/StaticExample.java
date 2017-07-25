package tr.org.linux.kamp.statics;

import tr.org.linux.kamp.student.student;

public class StaticExample {
	
	public static String myStaticString = "BU BİR STATİK STRİNG";
	
	public static String myStaticStringMethod() {
		return "BU BİR STATİC METOD";
		
	}
	
	static {
		System.out.println("Bu bir static blok");
	}
	
	static {
		System.out.println("Bu da bir static blok");
	}
	
	static {
		System.out.println("Bu da üçüncü static blok");
	}

}
