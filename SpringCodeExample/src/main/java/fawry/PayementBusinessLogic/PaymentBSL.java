package fawry.PayementBusinessLogic;

import static fawry.DataBase.PaymentTransactionDB.paymentTransactions;

import fawry.model.PaymentTransaction;
public class PaymentBSL{
	private IPayment ipayment;
	public String doPayement(String service,String serviceProvider,float amount,IPayment payment)
	{
		this.ipayment=payment;
		PaymentTransaction paymenT=new PaymentTransaction();
		float total=payment.pay(service,amount);
		paymenT.setAmount(total);
		paymenT.setServiceName(service);
		paymenT.setServiceProviderName(serviceProvider);
		paymentTransactions.add(paymenT);
		return "You should pay "+payment.pay(service,amount);
	}
	
}
