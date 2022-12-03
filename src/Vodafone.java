public class Vodafone extends ServiceProvider{
	public Service createService(String service)
	{
		if(service=="Mobile recharge")
			return new MobileRechargeService();
		else if (service=="Internet Payment")
			return new InternetPaymentServices();
		return new Donations();
	}
}