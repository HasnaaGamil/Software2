package fawry.ServiceModels;

public class InternetPaymentServices extends Service {
	public InternetPaymentServices()
	{
			form.put("Landline phone number","");
			form.put("Amount","");
			acceptCash=true;
			paymentMethods.add("Credit Card");
			paymentMethods.add("Wallet");
			paymentMethods.add("Cash");
	}
	public void setProvider()
	{
		serviceProvider.add("Internet payment"+" with "+"Vodafone");
		serviceProvider.add("Internet payment"+" with "+"We");
		serviceProvider.add("Internet payment"+" with "+"Etisalat");
		serviceProvider.add("Internet payment"+" with "+"Orange");
	}
}
