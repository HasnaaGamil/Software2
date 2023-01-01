package fawry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import fawry.BusinessLogic.RegestrationBSL;
import fawry.model.User;
@RestController
public class RegestrationController 
{
	private RegestrationBSL regestration;
	public RegestrationController()
	{
		regestration=new RegestrationBSL();
	}
	@GetMapping(value="/user/check")
	public User searchUser(@RequestBody User user)
	{ 
		return regestration.searchUser(user);
	}
	@PostMapping(value = "/user/signUp")
	public String signUp(@RequestBody User user)
	{
		return regestration.signUp(user);
	}
	@GetMapping(value = "/user/signIn")
	public String signIn(@RequestBody User user)
	{
		return regestration.signIn(user);
	}
}
