package fawry.controller.discount;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class OverallDiscount extends Discount{
	
	float discount=0;
	public OverallDiscount(){
		services.put("Mobile recharge",discount);
		services.put("Internet Payment",discount);
		services.put("Landline",discount);
		services.put("Donation",discount);
	}
	@Override
	public float getDiscount() {
		return discount;
	}
	@PostMapping(value="/admin/addAllDiscount")
	public String setDiscount(@RequestParam(value="discount") float discount)
	{
		this.discount = discount;
		float tmp=services.get("Mobile recharge");
		tmp+=this.discount;
	    services.replace("Mobile recharge", tmp);
	    tmp=services.get("Internet Payment");
		tmp+=this.discount;
	    services.replace("Internet Payment", tmp);
	    tmp=services.get("Landline");
		tmp+=this.discount;
	    services.replace("Landline", tmp);
	    tmp=services.get("Donation");
		tmp+=this.discount;
	    services.replace("Donation", tmp);
	    return "You have added "+discount+" % on overall services";
	}
	@GetMapping(value = "/user/displayDiscounts")
    public HashMap<String,Float> displayDiscounts()
    {
    	return services;
	}
	
}
