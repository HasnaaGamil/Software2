public class We extends ServiceProvider{
	public Service createService(String service)
	{
		if(service=="Mobile recharge")
			return new MobileRechargeService();
		else if (service=="Internet Payment")
			return new InternetPaymentServices();
		else if (service=="Landline")
			return new LandlineService();
		return new Donations();
	}
}
