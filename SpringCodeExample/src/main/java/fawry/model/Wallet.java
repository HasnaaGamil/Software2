package fawry.model;

public class Wallet {
	float funds=1000;	
	public void setFunds(float amount) {
		funds+=amount;
		
	}
	public float getFunds() {
		return funds;
	}
}
