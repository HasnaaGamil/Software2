import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Regestration {

	Scanner input = new Scanner(System.in);
	List<User> users = new ArrayList<User>();

	public boolean searchUser(User user) {
		for (int i = 0; i < users.size(); i++) {
			if (user.getUserName() == users.get(i).getUserName() ||
					user.getEmail() == users.get(i).getEmail())
				return false;
		}
		return true;
	}

	public boolean signUp(User user)
	{
		System.out.println("Enter your email .");
		String s=input.next();
		user.setEmail(s);
		System.out.println("Enter your user name .");
		s=input.next();
		user.setUserName(s);
		System.out.println("Enter your password .");
		s=input.next();
		user.setPassword(s);
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
		System.out.println("Enter your email and password.");
		String s=input.next();
		user.setEmail(s);
		s=input.next();
		user.setPassword(s);
		for(int i=0 ;i<users.size();i++)
		{
			if(user.getPassword()==users.get(i).getPassword()&&user.getEmail()==users.get(i).getEmail())
				return true;
		}
		return false;
	}
}