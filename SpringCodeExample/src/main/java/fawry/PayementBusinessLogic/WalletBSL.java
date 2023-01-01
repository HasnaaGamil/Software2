package fawry.PayementBusinessLogic;

import static fawry.controller.discount.Discount.services;

import org.springframework.stereotype.Service;

import fawry.model.Wallet;
@Service
public class WalletBSL implements IPayment {
	private Wallet wallet;
	public WalletBSL()
	{
		wallet=new Wallet();
	}
	@Override
	public float pay(String service,float amount) {
		if(wallet.getFunds()>=amount)
		{	
			if(services.get(service)==null)
			{
				float total =wallet.getFunds()-amount;
				wallet.setFunds(total);
				return amount;
			}
			else
			{
				Float dis = services.get(service);
				float total_amount=amount*(1-(dis/100));
				float total =wallet.getFunds()-total_amount;
				wallet.setFunds(total);
				return total_amount;
				
			} 
		}
		return -1;
	}
	}
