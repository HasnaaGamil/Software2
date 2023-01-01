package fawry.controller;

import static fawry.DataBase.AddToWalletTransactionDB.addingToWallet;
import static fawry.DataBase.PaymentTransactionDB.paymentTransactions;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fawry.model.AddToWalletTransaction;
import fawry.model.PaymentTransaction;
@RestController
public class TransactionController
{
	@GetMapping("/admin/ListTransactionPayment")
	public List<PaymentTransaction> ListTransactionPayment()
    {
    	return paymentTransactions;
    }
	@GetMapping("/admin/ListAddToWalletTranaction")
	public List<AddToWalletTransaction> ListAddToWalletTranaction()
    {
		return addingToWallet;
    }
	
}
