package fawry.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fawry.PayementBusinessLogic.Cash;
import fawry.PayementBusinessLogic.CreditCard;
import fawry.PayementBusinessLogic.PaymentBSL;
import fawry.PayementBusinessLogic.WalletBSL;
@RestController
public class PaymentHandler
{
	private PaymentBSL paymentBSL;
	public PaymentHandler()
	{
		paymentBSL= new PaymentBSL();
	}
	@PostMapping("/user/CashPaymentTransaction")
	public String doPaymentCash(@RequestParam("service")String service,@RequestParam("serviceProvider")String serviceProvider,@RequestParam("amount")float amount, Cash iPayment )
	{
		return paymentBSL.doPayement(service,serviceProvider,amount,iPayment);
	}
	@PostMapping("/user/WalletPaymentTransaction")
	public String doPaymentWallet(@RequestParam("service")String service,@RequestParam("serviceProvider")String serviceProvider,@RequestParam("amount")float amount, WalletBSL iPayment )
	{
		return paymentBSL.doPayement(service,serviceProvider,amount,iPayment);
	}
	@PostMapping("/user/CreditPaymentTransaction")
	public String doPaymentCreditCard(@RequestParam("service")String service,@RequestParam("serviceProvider")String serviceProvider,@RequestParam("amount")float amount,@RequestBody CreditCard iPayment )
	{
		return paymentBSL.doPayement(service,serviceProvider,amount,iPayment);
	}
	
}
