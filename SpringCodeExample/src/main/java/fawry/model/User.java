package fawry.model;

import fawry.PayementBusinessLogic.WalletBSL;

public class User {
  String userName;
  String password;
  String email;
  WalletBSL wallet;
  public void setUserName(String user)
  {
	  this.userName=user;
  }
  public String getUserName()
  {
	  return userName;
  }
  public void setPassword(String pass)
  {
	  this.password=pass;
  }
  public String getPassword()
  {
	  return password;
  }
  public void setEmail(String email)
  {
	  this.email=email;
  }
  public String getEmail()
  {
	  return email;
  }
  public WalletBSL getWallet()
  {
	  return wallet;
  }
}
