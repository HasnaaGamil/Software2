package fawry.BusinessLogic;

import static fawry.DataBase.UserDB.users;

import fawry.model.User;

public class RegestrationBSL {
	
	public User searchUser( User user)
	{ 
		for(int i=0 ;i<users.size();i++)
		{
			if(user.getUserName().equals(users.get(i).getUserName())||user.getEmail().equals(users.get(i).getEmail()))
				return users.get(i);
		}
		return null;
	}
	public String signUp(User user)
	{
		if(searchUser(user)==null)
		{
			users.add(user);
			return "Successfully signed up";
		}
		else
			return "Try another E-mail or user name";
	}
	public String signIn(User user)
	{
		for(int i=0 ;i<users.size();i++)
		{
			if(user.getPassword().equals(users.get(i).getPassword())&&user.getEmail().equals(users.get(i).getEmail()))
				return "Successfully signed in.";
		}
		return "Wrong email or password.";
	}

}
