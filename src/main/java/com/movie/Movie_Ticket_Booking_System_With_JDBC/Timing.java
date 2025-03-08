package com.movie.Movie_Ticket_Booking_System_With_JDBC;

import java.util.Scanner;

public class Timing 
{
	public static Scanner sc = new Scanner(System.in);
	public static String date1;
	public static String month1;
	public static String show1;
	public static int ticket1;
	public static String s1;
	public static String s2;
	public static  String s3;
	public void date() throws Exception
   	{
    	System.out.print(C.blue+"\n		Enter a date in the format dd(01-30) Or Enter 31.Back: "+C.whitebr);
    	String date = sc.next();
		switch(date)
		{
			case "01":
				this.date1=date;
				month();
				break;
			case "02":
				this.date1=date;
				month();
				break;
			case "03":
				this.date1=date;
				month();
				break;
			case "04":
				this.date1=date;
				month();
				break;
			case "05":
				this.date1=date;
				month();
				break;
			case "06":
				this.date1=date;
				month();
				break;
			case "07":
				this.date1=date;
				month();
				break;
			case "08":
				this.date1=date;
				month();
				break;
			case "09":
				this.date1=date;
				month();
				break;
			case "10":
				this.date1=date;
				month();
				break;
			case "11":
				this.date1=date;
				month();
				break;
			case "12":
				this.date1=date;
				month();
				break;
			case "13":
				this.date1=date;
				month();
				break;
			case "14":
				this.date1=date;
				month();
				break;
			case "15":
				this.date1=date;
				month();
				break;
			case "16":
				this.date1=date;
				month();
				break;
			case "17":
				this.date1=date;
				month();
				break;
			case "18":
				this.date1=date;
				month();
				break;
			case "19":
				this.date1=date;
				month();
				break;
			case "20":
				this.date1=date;
				month();
				break;
			case "21":
				this.date1=date;
				month();
				break;
			case "22":
				this.date1=date;
				month();
				break;
			case "23":
				this.date1=date;
				month();
				break;
			case "24":
				this.date1=date;
				month();
				break;
			case "25":
				this.date1=date;
				month();
				break;
			case "26":
				this.date1=date;
				month();
				break;
			case "27":
				this.date1=date;
				month();
				break;
			case "28":
				this.date1=date;
				month();
				break;
			case "29":
				this.date1=date;
				month();
				break;
			case "30":
				this.date1=date;
				month();
				break;
			case "31":
				new Login().Back();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n		Invalid Date"+C.whitebr);
				date();
		}
   	}
	public void month() throws Exception
	{
		System.out.print(C.blue+"\n		Enter a Month in the format MM(01-12) Or Enter 13.Back:"+C.whitebr);
		String mon = sc.next();
		switch(mon)
		{
			case "01":
				this.month1=mon;
				show();
				break;
			case "02":
				this.month1=mon;
				show();
				break;
			case "03":
				this.month1=mon;
				show();
				break;
			case "04":
				this.month1=mon;
				show();
				break;
			case "05":
				this.month1=mon;
				show();
				break;
			case "06":
				this.month1=mon;
				show();
				break;
			case "07":
				this.month1=mon;
				show();
				break;
			case "08":
				this.month1=mon;
				show();
				break;
			case "09":
				this.month1=mon;
				show();
				break;
			case "10":
				this.month1=mon;
				show();
				break;
			case "11":
				this.month1=mon;
				show();
				break;
			case "12":
				this.month1=mon;
				show();
				break;
			case "13":
				new Login().Back();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n		Invalid Month"+C.whitebr);
				month();
		}
	}
  	public void show() throws Exception
  	{
    	System.out.print(C.redbri+"\n		Select a show time OR Select 5. Back\n"+C.whitebr+"			1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\n			Enter: ");
		String x=sc.next();
    	switch(x)
   	 	{
    			case "1":System.out.println(C.blue+"\n			Selected show time is 11:00 AM"+C.whitebr);
				this.show1="11:00 AM";
				ticket();
				break;
    			case "2":System.out.println(C.blue+"\n			Selected show time is 2:00 PM"+C.whitebr);
				this.show1="2:00 PM";
				ticket();
				break;
   			case "3":System.out.println(C.blue+"\n			Selected show time is 6:00 PM"+C.whitebr);
				this.show1="6:00 PM";
				ticket();
				break;
    			case "4":System.out.println(C.blue+"\n			Selected show time is 9:00 PM"+C.whitebr);
				this.show1="9:00 PM";
				ticket();
				break;
			case "5":
				Location loc = new Location();
				System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
				System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
				loc.m1(sc.next());
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n			Invalid Show Timing"+C.whitebr);
				show();
				break;
   		}
 	}
	public void ticket() throws Exception
	{	
		System.out.print(C.redbri+"\n		Please Enter Number of Tickets 1-3 Or 4. Back\n"+C.whitebr+"		Enter: ");
		String a = sc.next();
		if(a.equals("1") || a.equals("2") || a.equals("3"))
		{
			int b=0;
			if(a.equals("1")) b=1;
			if(a.equals("2")) b=2;
			if(a.equals("3")) b=3;
			this.ticket1=b;
			System.out.println("\n		Each Ticket Price : 100/-");
			switch(b)
			{
				case 1:
					seat(1);
					break;
				case 2:
					seat(1,1);
					break;
				case 3:
					seat(1,1,1);
					break;
			}
		}
		else if(a.equals("4"))
		{
			show();
		}
		else
		{
			System.out.println(C.redbri+C.blink+"\n		Invalid Number of Tickets"+C.whitebr);
			ticket();
		}
	}
	public void seat(int a) throws Exception
	{
		System.out.println("\t\t\t\t\t01  02  03  04\n\t\t\t\t\t05  06  07  08\n\t\t\t\t\t09  10  11  12\n\t\t\t\t\t13  14  15  16\n\t\t\t\t\t17  18  19  20\n\t\t\t\t\t21  22  23  24\n\t\t\t\t\t25  26  27  28\n\t\t\t\t\t29          30\n\n\n\t\t\t\t------------------------------\n");
		System.out.print(C.redbri+"\n		Enter seat number between 01-30 or 31. Back\n"+C.whitebr+"		Enter: ");
		String b = sc.next();
		switch(b)
		{
			case "01":
				this.s1="01";
				new food().order();
				break;
			case "02":
				this.s1="02";
				new food().order();
				break;
			case "03":
				this.s1="03";
				new food().order();
				break;
			case "04":
				this.s1="04";
				new food().order();
				break;
			case "05":
				this.s1="05";
				new food().order();
				break;
			case "06":
				this.s1="06";
				new food().order();
				break;
			case "07":
				this.s1="07";
				new food().order();
				break;
			case "08":
				this.s1="08";
				new food().order();
				break;
			case "09":
				this.s1="09";
				new food().order();
				break;
			case "10":
				this.s1="10";
				new food().order();
				break;
			case "11":
				this.s1="11";
				new food().order();
				break;
			case "12":
				this.s1="12";
				new food().order();
				break;
			case "13":
				this.s1="13";
				new food().order();
				break;
			case "14":
				this.s1="14";
				new food().order();
				break;
			case "15":
				this.s1="15";
				new food().order();
				break;
			case "16":
				this.s1="16";
				new food().order();
				break;
			case "17":
				this.s1="17";
				new food().order();
				break;
			case "18":
				this.s1="18";
				new food().order();
				break;
			case "19":
				this.s1="19";
				new food().order();
				break;
			case "20":
				this.s1="20";
				new food().order();
				break;
			case "21":
				this.s1="21";
				new food().order();
				break;
			case "22":
				this.s1="22";
				new food().order();
				break;
			case "23":
				this.s1="23";
				new food().order();
				break;
			case "24":
				this.s1="24";
				new food().order();
				break;
			case "25":
				this.s1="25";
				new food().order();
				break;
			case "26":
				this.s1="26";
				new food().order();
				break;
			case "27":
				this.s1="27";
				new food().order();
				break;
			case "28":
				this.s1="28";
				new food().order();
				break;
			case "29":
				this.s1="29";
				new food().order();
				break;
			case "30":
				this.s1="30";
				new food().order();
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Seat"+C.whitebr);
				seat(1);
		}
	}
	public void seat(int a,int b) throws Exception
	{
		System.out.println("\t\t\t\t\t01  02  03  04\n\t\t\t\t\t05  06  07  08\n\t\t\t\t\t09  10  11  12\n\t\t\t\t\t13  14  15  16\n\t\t\t\t\t17  18  19  20\n\t\t\t\t\t21  22  23  24\n\t\t\t\t\t25  26  27  28\n\t\t\t\t\t29          30\n\n\n\t\t\t\t------------------------------\n");
		System.out.print(C.redbri+"\n		Enter First seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String c = sc.next();
		switch(c)
		{
			case "01":
				this.s1="01";
				break;
			case "02":
				this.s1="02";
				break;
			case "03":
				this.s1="03";
				break;
			case "04":
				this.s1="04";
				break;
			case "05":
				this.s1="05";
				break;
			case "06":
				this.s1="06";
				break;
			case "07":
				this.s1="07";
				break;
			case "08":
				this.s1="08";
				break;
			case "09":
				this.s1="09";
				break;
			case "10":
				this.s1="10";
				break;
			case "11":
				this.s1="11";
				break;
			case "12":
				this.s1="12";
				break;
			case "13":
				this.s1="13";
				break;
			case "14":
				this.s1="14";
				break;
			case "15":
				this.s1="15";
				break;
			case "16":
				this.s1="16";
				break;
			case "17":
				this.s1="17";
				break;
			case "18":
				this.s1="18";
				break;
			case "19":
				this.s1="19";
				break;
			case "20":
				this.s1="20";
				break;
			case "21":
				this.s1="21";
				break;
			case "22":
				this.s1="22";
				break;
			case "23":
				this.s1="23";
				break;
			case "24":
				this.s1="24";
				break;
			case "25":
				this.s1="25";
				break;
			case "26":
				this.s1="26";
				break;
			case "27":
				this.s1="27";
				break;
			case "28":
				this.s1="28";
				break;
			case "29":
				this.s1="29";
				break;
			case "30":
				this.s1="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid First Seat Please RE-Enter"+C.whitebr);
				seat(1,1);
				break;
		}
		System.out.print(C.redbri+"\n		Enter Second seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String d = sc.next();
		switch(d)
		{
			case "01":
				this.s2="01";
				break;
			case "02":
				this.s2="02";
				break;
			case "03":
				this.s2="03";
				break;
			case "04":
				this.s2="04";
				break;
			case "05":
				this.s2="05";
				break;
			case "06":
				this.s2="06";
				break;
			case "07":
				this.s2="07";
				break;
			case "08":
				this.s2="08";
				break;
			case "09":
				this.s2="09";
				break;
			case "10":
				this.s2="10";
				break;
			case "11":
				this.s2="11";
				break;
			case "12":
				this.s2="12";
				break;
			case "13":
				this.s2="13";
				break;
			case "14":
				this.s2="14";
				break;
			case "15":
				this.s2="15";
				break;
			case "16":
				this.s2="16";
				break;
			case "17":
				this.s2="17";
				break;
			case "18":
				this.s2="18";
				break;
			case "19":
				this.s2="19";
				break;
			case "20":
				this.s2="20";
				break;
			case "21":
				this.s2="21";
				break;
			case "22":
				this.s2="22";
				break;
			case "23":
				this.s2="23";
				break;
			case "24":
				this.s2="24";
				break;
			case "25":
				this.s2="25";
				break;
			case "26":
				this.s2="26";
				break;
			case "27":
				this.s2="27";
				break;
			case "28":
				this.s2="28";
				break;
			case "29":
				this.s2="29";
				break;
			case "30":
				this.s2="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Second Seat Please RE-Enter"+C.whitebr);
				seat(1,1);
				break;
		}
		if(c.equals(d))
		{
			System.out.println(C.blink+"		Please Enter Different Seats"+C.whitebr);
			seat(1,1);
		}
		else
		{
			new food().order();
		}
	}
	public void seat(int a,int b,int c) throws Exception
	{
		System.out.println("\t\t\t\t\t01  02  03  04\n\t\t\t\t\t05  06  07  08\n\t\t\t\t\t09  10  11  12\n\t\t\t\t\t13  14  15  16\n\t\t\t\t\t17  18  19  20\n\t\t\t\t\t21  22  23  24\n\t\t\t\t\t25  26  27  28\n\t\t\t\t\t29          30\n\n\n\t\t\t\t------------------------------\n");
		System.out.print(C.redbri+"\n		Enter First seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String d = sc.next();
		switch(d)
		{
			case "01":
				this.s1="01";
				break;
			case "02":
				this.s1="02";
				break;
			case "03":
				this.s1="03";
				break;
			case "04":
				this.s1="04";
				break;
			case "05":
				this.s1="05";
				break;
			case "06":
				this.s1="06";
				break;
			case "07":
				this.s1="07";
				break;
			case "08":
				this.s1="08";
				break;
			case "09":
				this.s1="09";
				break;
			case "10":
				this.s1="10";
				break;
			case "11":
				this.s1="11";
				break;
			case "12":
				this.s1="12";
				break;
			case "13":
				this.s1="13";
				break;
			case "14":
				this.s1="14";
				break;
			case "15":
				this.s1="15";
				break;
			case "16":
				this.s1="16";
				break;
			case "17":
				this.s1="17";
				break;
			case "18":
				this.s1="18";
				break;
			case "19":
				this.s1="19";
				break;
			case "20":
				this.s1="20";
				break;
			case "21":
				this.s1="21";
				break;
			case "22":
				this.s1="22";
				break;
			case "23":
				this.s1="23";
				break;
			case "24":
				this.s1="24";
				break;
			case "25":
				this.s1="25";
				break;
			case "26":
				this.s1="26";
				break;
			case "27":
				this.s1="27";
				break;
			case "28":
				this.s1="28";
				break;
			case "29":
				this.s1="29";
				break;
			case "30":
				this.s1="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid First Seat Please RE-Enter"+C.whitebr);
				seat(1,1,1);
				break;
		}
		System.out.print(C.redbri+"\n		Enter Second seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String e = sc.next();
		switch(e)
		{
			case "01":
				this.s2="01";
				break;
			case "02":
				this.s2="02";
				break;
			case "03":
				this.s2="03";
				break;
			case "04":
				this.s2="04";
				break;
			case "05":
				this.s2="05";
				break;
			case "06":
				this.s2="06";
				break;
			case "07":
				this.s2="07";
				break;
			case "08":
				this.s2="08";
				break;
			case "09":
				this.s2="09";
				break;
			case "10":
				this.s2="10";
				break;
			case "11":
				this.s2="11";
				break;
			case "12":
				this.s2="12";
				break;
			case "13":
				this.s2="13";
				break;
			case "14":
				this.s2="14";
				break;
			case "15":
				this.s2="15";
				break;
			case "16":
				this.s2="16";
				break;
			case "17":
				this.s2="17";
				break;
			case "18":
				this.s2="18";
				break;
			case "19":
				this.s2="19";
				break;
			case "20":
				this.s2="20";
				break;
			case "21":
				this.s2="21";
				break;
			case "22":
				this.s2="22";
				break;
			case "23":
				this.s2="23";
				break;
			case "24":
				this.s2="24";
				break;
			case "25":
				this.s2="25";
				break;
			case "26":
				this.s2="26";
				break;
			case "27":
				this.s2="27";
				break;
			case "28":
				this.s2="28";
				break;
			case "29":
				this.s2="29";
				break;
			case "30":
				this.s2="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Second Seat Please RE-Enter"+C.whitebr);
				seat(1,1,1);
				break;
		}
		System.out.print(C.redbri+"\n		Enter Third seat numbers between 01-30 Or 31. Back\n"+C.whitebr+"		Enter: ");
		String f = sc.next();
		switch(f)
		{
			case "01":
				this.s3="01";
				break;
			case "02":
				this.s3="02";
				break;
			case "03":
				this.s3="03";
				break;
			case "04":
				this.s3="04";
				break;
			case "05":
				this.s3="05";
				break;
			case "06":
				this.s3="06";
				break;
			case "07":
				this.s3="07";
				break;
			case "08":
				this.s3="08";
				break;
			case "09":
				this.s3="09";
				break;
			case "10":
				this.s3="10";
				break;
			case "11":
				this.s3="11";
				break;
			case "12":
				this.s3="12";
				break;
			case "13":
				this.s3="13";
				break;
			case "14":
				this.s3="14";
				break;
			case "15":
				this.s3="15";
				break;
			case "16":
				this.s3="16";
				break;
			case "17":
				this.s3="17";
				break;
			case "18":
				this.s3="18";
				break;
			case "19":
				this.s3="19";
				break;
			case "20":
				this.s3="20";
				break;
			case "21":
				this.s3="21";
				break;
			case "22":
				this.s3="22";
				break;
			case "23":
				this.s3="23";
				break;
			case "24":
				this.s3="24";
				break;
			case "25":
				this.s3="25";
				break;
			case "26":
				this.s3="26";
				break;
			case "27":
				this.s3="27";
				break;
			case "28":
				this.s3="28";
				break;
			case "29":
				this.s3="29";
				break;
			case "30":
				this.s3="30";
				break;
			case "31":
				ticket();
				break;
			default:
				System.out.println(C.redbri+C.blink+"		Invalid Third Seat Please RE-Enter"+C.whitebr);
				seat(1,1,1);
				break;
		}
		if(d.equals(e) || e.equals(f) || d.equals(f))
		{
			System.out.println(C.blink+"		Please Enter Different Seats"+C.whitebr);
			seat(1,1,1);
		}
		else
		{
			new food().order();
		}
	}
	public String se(int a)
	{
		if(a==1)
			return s1+".";
		else if(a==2)
			return s1+", "+s2+".";
		else
			return s1+", "+s2+", "+s3+".";
	}
}
