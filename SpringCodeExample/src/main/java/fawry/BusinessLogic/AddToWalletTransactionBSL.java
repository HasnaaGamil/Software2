package fawry.BusinessLogic;

import static fawry.DataBase.AddToWalletTransactionDB.addingToWallet;

import fawry.PayementBusinessLogic.CreditCard;
import fawry.model.AddToWalletTransaction;
import fawry.model.Wallet;

public class AddToWalletTransactionBSL
{
	private Wallet wallet;
	public AddToWalletTransactionBSL()
	{
		wallet=new Wallet();
	}
	public String addFunds(float amount,String userName,CreditCard cc)
	{
		if(cc.checkExpire()==false)
		{
			wallet.setFunds(amount);
			AddToWalletTransaction aa= new AddToWalletTransaction();
			aa.setAmount(amount);
			aa.setCurrentBalance(wallet.getFunds());
			aa.setUserName(userName);
			addingToWallet.add(aa);
			return "Successfully adding to wallet via credit card ";
		}	
		else
			return "Credit card is expired";

	
	}
}
