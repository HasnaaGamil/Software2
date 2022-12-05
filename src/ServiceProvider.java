public abstract class ServiceProvider {
	Payment payment;
	boolean acceptCash=false;
	public abstract Service createService(String service);
	public void setPayment(Payment obj)
	{
		payment=obj;
	}
	public void performPayment()
	{
		
		System.out.println("You can pay "+payment.pay()+" EGP");
	}
	public boolean getAcceptCash()
	{
		return acceptCash;
	}
	public void printPaymentMethods()
	{
		System.out.println("Choose the payment method: ");
		System.out.println("1-Credit Card");
		System.out.println("2-Wallet");
		if(getAcceptCash()==true)
		{
			System.out.println("3-Cash");
		}
		
	}
}