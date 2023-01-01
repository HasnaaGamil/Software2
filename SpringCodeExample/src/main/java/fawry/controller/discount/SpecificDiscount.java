package fawry.controller.discount;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpecificDiscount extends Discount{
	float discount=5;
	@PostMapping(value="/admin/addSpecificDicount")
	public String setDiscount(@RequestParam("discount") float discount,@RequestParam("service") String service)
	{
		this.discount=discount;
		if(services.get(service)==null)
		{
			services.put(service, discount);
		}
		else
		{
			float tmp=services.get(service);
			tmp+=this.discount;
		    services.replace(service, tmp);
		}
		return "You have added "+discount+" % on "+service+" services";
	}
	@Override
	public float getDiscount() {
		return this.discount;
	}
}
