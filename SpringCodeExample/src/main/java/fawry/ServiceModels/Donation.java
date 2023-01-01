package fawry.ServiceModels;

public class Donation extends Service {
	public Donation()
	{
			form.put("Organization","");
			form.put("Amount","");
			acceptCash=true;
			paymentMethods.add("Credit Card");
			paymentMethods.add("Wallet");
			acceptCash=false;
	}
	public void setProvider()
	{
		serviceProvider.add("Donation"+" with "+"Vodafone");
		serviceProvider.add("Donation"+" with "+"We");
	}
	
	
}
