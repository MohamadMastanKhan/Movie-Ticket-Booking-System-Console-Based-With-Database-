package com.movie.Movie_Ticket_Booking_System_With_JDBC;


public class User 
{
	private String UserNameL = "mastan";
	private String PassWordL = "Mastan@2002";
	private String UserNameS = "";
	private String PassWordS;
	public String getterUL()
	{
		return UserNameL;
	}
	public void SetterPL(String a)
	{
		this.PassWordL=a;
	}
	public String getterPL()
	{
		return PassWordL;
	}
	public void SetterUS(String a)
	{
		this.UserNameS=a;
	}
	public String getterUS()
	{
		return UserNameS;
	}
	public void SetterPS(String a)
	{
		this.PassWordS=a;
	}
	public String getterPS()
	{
		return PassWordS;
	}
}
