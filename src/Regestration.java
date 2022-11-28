import java.util.ArrayList;
import java.util.List;

public class Regestration {

	List<User>users= new ArrayList<User> ();
	public boolean searchUser(User user)
	{ 
		for(int i=0 ;i<users.size();i++)
		{
			if(user.getUserName()==users.get(i).getUserName()||user.getEmail()==users.get(i).getEmail())
				return false;
		}
		return true;
	}
	public boolean signUp(User user)
	{
		if(searchUser(user))
		{
			users.add(user);
			System.out.println("Successfully signed up");
			return true;
		}
		else
			System.out.println("Try another E-mail or user name");	
		return false;
	}
	public boolean signIn(User user)
	{
		for(int i=0 ;i<users.size();i++)
		{
			if(user.getPassword()==users.get(i).getPassword()&&user.getEmail()==users.get(i).getEmail())
				return true;
		}
		return false;
	}
}