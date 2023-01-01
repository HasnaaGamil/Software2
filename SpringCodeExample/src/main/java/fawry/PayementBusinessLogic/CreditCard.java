package fawry.PayementBusinessLogic;
import static fawry.controller.discount.Discount.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;
@Service
public class CreditCard implements IPayment{
    private long ccNumber;
    private String cvv;
    private String dateOfExpiry;
    
    public long getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(long ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public boolean checkExpire() {
        boolean expired;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);
        Date expiry = null;
        try {
            expiry = simpleDateFormat.parse(dateOfExpiry);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        expired = expiry.before(new Date());
        return expired;
    }

	@Override
	public float pay(String service, float amount) {
		 if (checkExpire() == false)
		 {
			 
				if(services.get(service)==null)
				{
					return amount;	
				}
				else
				{
                    float dis = services.get(service);
					float total_amount=amount*(1-(dis/100));
					return total_amount;
				}
	       }
		 else
	        	 return -1;
	       
	}
   
        
}
