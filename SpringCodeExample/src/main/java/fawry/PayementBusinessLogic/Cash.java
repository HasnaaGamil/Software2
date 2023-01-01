package fawry.PayementBusinessLogic;

import static fawry.controller.discount.Discount.services;

import org.springframework.stereotype.Service;
@Service
public class Cash implements IPayment {
	@Override
	public float pay(String service, float amount) {
		float dis=services.get(service);
		if(services.get(service)==null)
		{
			return amount;
		}
		else
		{
			return amount*(1-(dis/100));
		}
		
	}

}
