package fawry.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fawry.BusinessLogic.RefundRequestBSL;
import fawry.model.RefundRequest;
@RestController
public class RefundRequestController {
	private RefundRequestBSL RR;
	public RefundRequestController()
	{
		RR=new RefundRequestBSL();
	}
	@PostMapping("/user/askRefundRequest")
	public String addRequest(@RequestParam("amount")float amount,@RequestParam("service") String service )
    {
		return RR.addRequest(amount, service);
    }
	@DeleteMapping("/admin/reply")
	public boolean ReplyOnRequest(@RequestParam("id") int id,@RequestParam("choice") char c)
    {
		return RR.ReplyOnRequest(id, c);
    }
	@GetMapping("/admin/ListRequest")
	public List<RefundRequest> ListRequest()
    {
		return RR.ListRequest();
    }
 
}
