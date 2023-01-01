package fawry.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fawry.BusinessLogic.AddToWalletTransactionBSL;
import fawry.PayementBusinessLogic.CreditCard;
@RestController
class AddToWalletHandler
{
	private AddToWalletTransactionBSL w;
	public AddToWalletHandler()
	{
		w=new AddToWalletTransactionBSL();
	}
	@PostMapping(value = "/users/addFunds")
	public String addFunds(@RequestParam("amount") float amount, @RequestParam("userName")String userName,@RequestBody CreditCard cc)
	{
			 return w.addFunds(amount, userName, cc);
	}
}
