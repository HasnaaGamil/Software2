package fawry.ServiceModels;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fawry.PayementBusinessLogic.IPayment;

public abstract class Service {
	static HashMap<String, String> form  = new HashMap<>();
	static List<String>serviceProvider= new ArrayList<String>();
	List<String>paymentMethods=new ArrayList<String>();
	IPayment payment;
	boolean acceptCash=false;
	abstract public void setProvider();
	public void setPayment(IPayment obj)
	{
		payment=obj;
	}
	public boolean getAcceptCash()
	{
		return acceptCash;
	}
	public HashMap<String, String> getFormField()
	{
		return form;
	}
	public static List<String> getProvider() {
		return serviceProvider;
	}
	public List<String>displayPaymentMethods()
	{
		return paymentMethods;
	}
	
}