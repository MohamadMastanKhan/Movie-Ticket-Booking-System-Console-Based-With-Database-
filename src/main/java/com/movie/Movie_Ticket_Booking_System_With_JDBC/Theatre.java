package com.movie.Movie_Ticket_Booking_System_With_JDBC;

import java.util.Scanner;

public class Theatre
{
	static Scanner sc = new Scanner(System.in);
	public static String the;
	public void theatre1() throws Exception
	{
		this.the="Prasad Imax";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("1");
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. Prasad Imax or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre1();
		}
	}
	public void theatre2() throws Exception
	{
		this.the="Sudarshan 35mm";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("1");
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. Sudarshan 35mm or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre2();
		}
	}
	public void theatre3() throws Exception
	{
		this.the="PVR";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("2");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. PVR or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre3();
		}
	}
	public void theatre4() throws Exception
	{
		this.the="INOX";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("2");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. INOX or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre4();
		}
	}
	public void theatre5() throws Exception
	{
		this.the="Melody";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("3");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. MELODY or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre4();
		}
	}
	public void theatre6() throws Exception
	{
		this.the="Cinepolis";
		switch(sc.next())
		{
			case "1":
				new Timing().date();
				break;
			case "2":
				new Location().m1("3");	
				break;
			case "3":
				System.out.println("		Logout Successfully");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Data Please RE-Enter"+C.whitebr);
				System.out.println(C.redbri+"\n		Please Enter Theatre 1. Cinepolis or 2. Back 3. Logout"+C.whitebr);
				System.out.print("		Enter: ");
				theatre4();
		}
	}
}
