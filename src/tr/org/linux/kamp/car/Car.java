package tr.org.linux.kamp.car;

public class Car {

	private int gear;
	private int speed;
	private String brand;
	
	public Car () {
	//	System.out.println("Araba nesnesi oluştu");
	}
	
	public Car (int gear, int speed, String brand) {
		
		this.gear=gear;
		this.speed=speed;
		this.brand=brand;
		
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
