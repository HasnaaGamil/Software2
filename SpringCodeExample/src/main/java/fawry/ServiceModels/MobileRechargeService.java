package fawry.ServiceModels;

public class MobileRechargeService extends Service {
	public MobileRechargeService()
	{
			form.put("Phone number","");
			form.put("Amount","");
			acceptCash=true;
			paymentMethods.add("Credit Card");
			paymentMethods.add("Wallet");
			paymentMethods.add("Cash");
	}
	public void setProvider()
	{
		serviceProvider.add("Mobile recharge"+" with "+"Vodafone");
		serviceProvider.add("Mobile recharge"+" with "+"We");
		serviceProvider.add("Mobile recharge"+" with "+"Etisalat");
		serviceProvider.add("Mobile recharge"+" with "+"Orange");
	}

}