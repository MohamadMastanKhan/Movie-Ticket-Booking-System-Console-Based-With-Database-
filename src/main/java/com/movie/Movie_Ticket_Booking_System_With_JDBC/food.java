package com.movie.Movie_Ticket_Booking_System_With_JDBC;

import java.util.Scanner;

public class food 
{
	static Scanner sc = new Scanner(System.in);
	public static int piz;
	public static int co;
	public void order() throws Exception
	{
		System.out.print(C.blue+"\n\n		Enter 1. Order Food 2. Ticket Book 3. Back\n"+C.whitebr+"		Enter: ");
		switch(sc.next())
		{
			case "1":
				System.out.println("		Only one item is available");
				pizza();
				break;
			case "2":
				this.piz = 0;
				this.co = 0;
				new confirm().con();
				break;
			case "3":
			try {
				if(Timing.ticket1==1) new Timing().seat(1);
				else if(Timing.ticket1==2) new Timing().seat(1,1);
				else if(Timing.ticket1==3) new Timing().seat(1,1,1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			default:
				System.out.println(C.blink+"		Invalid Data Plz Re-enter"+C.whitebr);
				order();
				break;
		}
	}
	public void pizza() throws Exception
	{
		System.out.print(C.redbri+"\n		Enter 1. Pizza  2. Back\n"+C.whitebr+"		Enter: ");
		String a = sc.next();
		if(a.equals("1"))
		{
			System.out.print(C.redbri+"\n		Enter Number of pizza you want (01-10) each 150/- Or 11. Back\n"+C.whitebr+"		Enter: ");
			String piz = sc.next();
			switch(piz)
			{
				case "01":
					this.piz=1;
					coup();
					break;
				case "02":
					this.piz=2;
					coup();
					break;
				case "03":
					this.piz=3;
					coup();
					break;
				case "04":
					this.piz=4;
					coup();
					break;
				case "05":
					this.piz=5;
					coup();
					break;
				case "06":
					this.piz=6;
					coup();
					break;
				case "07":
					this.piz=7;
					coup();
					break;
				case "08":
					this.piz=8;
					coup();
					break;
				case "09":
					this.piz=9;
					coup();
					break;
				case "10":
					this.piz=10;
					coup();
					break;
				case "11":
					pizza();
					break;
				default:
					System.out.println(C.redbri+C.blink+"		Range Exceeds Please Re-enter"+C.whitebr);
					pizza();
					break;
			}
		}
		else if(a.equals("2"))
		{
			try {
				order();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
			pizza();
		}
	
	}
	public void coup() throws Exception
	{
		System.out.println(C.blue+C.blink+"\n		Enter Food Coupons to get discount"+C.whitebr);
		System.out.print("		Enter 1. Available 2. No Coupons\n		Enter: ");
		switch(sc.next())
		{
			case "1":
				coup1();
				break;
			case "2":
				System.out.print("\n		Enter 1. Confirm Booking 2. Back\n		Enter: ");
				String a = sc.next();
				if(a.equals("1"))
				{
					new confirm().con();
				}
				else if(a.equals("2"))
				{
					pizza();
				}
				else 
				{
					System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
					coup();
				}
				break;
			default:
				System.out.println("		Invalid Data");
				coup();
		}
	}
	public void coup1() throws Exception
	{
		System.out.print(C.redbri+"\n		Enter Any one Coupon OR 1. Back\n"+C.whitebr+"		Enter: ");
		coupons obj = new coupons();
		String a = sc.next();
		if(a.equals(obj.gettera()))
		{
			System.out.println(C.yellow+C.blink+"\n		Congratulations you get 10% off on food items"+C.whitebr);
			System.out.print("\n		Enter 1. Confirm Booking 2. Back\n		Enter: ");
			String s = sc.next();
			if(s.equals("1"))
			{
				this.co=10;
				new confirm().con();
			}
			else if(s.equals("2"))
			{
				this.co=0;
				coup();
			}
			else
			{
				System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
				coup1();
			}
		}
		else if(a.equals(obj.getterb()))
		{
			System.out.println(C.yellow+C.blink+"\n		Congratulations you get 20% off on food items"+C.whitebr);
			System.out.print("\n		Enter 1. Confirm Booking 2. Back\n		Enter: ");
			String s = sc.next();
			if(s.equals("1"))
			{
				this.co=20;
				new confirm().con();
			}
			else if(s.equals("2"))
			{
				this.co=0;
				coup();
			}
			else
			{
				System.out.println(C.redbri+C.blink+"		Invalid Data Please Re-enter"+C.whitebr);
				coup1();
			}
		}
		else if(a.equals("1"))
		{
			coup();
		}
		else
		{
			System.out.println(C.redbri+C.blink+"		Invalid Coupon Please Re-enter"+C.whitebr);
			coup1();
		}
	}
}
