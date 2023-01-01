package fawry.controller;


import java.util.HashMap;
import java.util.List;

import java.util.Set;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fawry.BusinessLogic.ServiceBSL;

@RestController
public class ServiceController {
	private ServiceBSL service;
	public ServiceController()
	{
		service=new ServiceBSL();
	}
	@GetMapping("/user/searchForService")
	public List<String> searchService(@RequestParam("service") String service)
	{
		return this.service.searchService(service);
	}
	@GetMapping("/user/getFormService")
	public Set<String> printFormService(@RequestParam("service")String service)
	{
		return this.service.printFormService(service);
	}
	@PostMapping("/user/fillFormService")
	public HashMap<String, String> fillForm(@RequestBody HashMap<String, String> form)
	{
		return form;
	}
	@GetMapping("/user/getPaymentMethods")
	List<String>displayPaymentMethods()
	{
		return service.displayPaymentMethods();
	}
	
}
