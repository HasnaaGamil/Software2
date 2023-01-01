package fawry.BusinessLogic;

import java.util.List;
import java.util.Set;

import fawry.ServiceModels.Donation;
import fawry.ServiceModels.InternetPaymentServices;
import fawry.ServiceModels.LandlineService;
import fawry.ServiceModels.MobileRechargeService;

public class ServiceBSL {
	private fawry.ServiceModels.Service sservice;
	public List<String> searchService(String service)
	{
		if(service.equals("Mobile")||service.equals("mobile"))
		{
			sservice=new MobileRechargeService();
			sservice.setProvider();
		}
		else if(service.equals("Internet")||service.equals("internet"))
		{
			sservice=new InternetPaymentServices();
			sservice.setProvider();
		}
		else if(service.equals("Landline")||service.equals("landline"))
		{
			sservice=new LandlineService();
			sservice.setProvider();
		}
		else if(service.equals("Donation")||service.equals("donation"))
		{
			sservice=new Donation();
			sservice.setProvider();
		}
		return sservice.getProvider();
		
	}
	public Set<String> printFormService(String service)
	{
		if(service.equals("Mobile recharge")||service.equals("mobile recharge")||service.equals("Mobile Recharge"))
		{
			sservice=new MobileRechargeService();
		}
		else if(service.equals("Internet payment")||service.equals("internet payment")||service.equals("Internet Payment"))
		{
			sservice=new InternetPaymentServices();
		}
		else if(service.equals("Donations")||service.equals("donations")||service.equals("Donation")||service.equals("donation"))
		{
			sservice=new Donation();
		}
		else if(service.equals("Landline")||service.equals("Landline Services")||service.equals("Landline services"))
		{
			sservice=new LandlineService();	
		}
		return sservice.getFormField().keySet();	
	}
	public List<String>displayPaymentMethods()
	{
		return sservice.displayPaymentMethods();
	}
}
