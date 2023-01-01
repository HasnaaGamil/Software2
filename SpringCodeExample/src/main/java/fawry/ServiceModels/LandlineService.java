package fawry.ServiceModels;

public class LandlineService extends Service{
	public void setFields()
	{
		form.put("Area code ","");
		form.put("Landline number","");
		form.put("Amount","");
		acceptCash=true;	
		paymentMethods.add("Credit Card");
		paymentMethods.add("Wallet");
		paymentMethods.add("Cash");
	}
	public void setProvider()
	{
		serviceProvider.add("Land line"+" with "+"We");
	}
	
}
