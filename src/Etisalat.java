public class Etisalat extends ServiceProvider{
	public Service createService(String service)
	{
		if(service=="Mobile recharge")
			return new MobileRechargeService();
		return new InternetPaymentServices();
	}
}