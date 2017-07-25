// java hem compiler hem interpreint

package tr.org.linux.kamp.account;

public class Account {
	
	private String name;				//field
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance;
			
		}
	}

	
	public Account() {
		
	}
	
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance = balance + depositAmount;
			
		}
	}
	
	
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName1(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

