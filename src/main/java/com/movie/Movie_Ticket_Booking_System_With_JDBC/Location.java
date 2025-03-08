package com.movie.Movie_Ticket_Booking_System_With_JDBC;
import java.util.*;

public class Location
{
	static Scanner sc=new Scanner(System.in);
	public static String Loc;
	public void m1(String a) throws Exception
	{
		switch(a)
		{
			case "1":
				System.out.println(C.blue+"\n		List of Movies in Hyderabad Location");
				this.Loc="Hyderabad";
				Moviename ob1 = new Moviename();
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Salaar\n			2. RRR\n			3. THE NUN\n			Enter: ");
				ob1.moviesH();
				break;
			case "2":
				System.out.println(C.blue+"\n		List of Movies in Mumbai Location");
				this.Loc="Mumbai";
				Moviename ob2 = new Moviename();
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Jailer\n			2. Animal\n			3. OG\n			Enter: ");
				ob2.moviesM();
				break;
			case "3":
				System.out.println(C.blue+"\n		List of Movies in Vizag Location");
				this.Loc="Vizag";
				Moviename ob3 = new Moviename();
				System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. LEO\n			2. Tiger-3\n			3. Jawan\n			Enter: ");
				ob3.moviesV();
				break;
			case "4":
				System.out.println("\n	Logout Successfull");
				new Login().log1();
				break;
			default:
				System.out.println(C.redbri+C.blink+"\n	Invalid Input Please RE-Enter any one of the Option Given Below Or 4. Logout");
				System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
				m1(sc.next());
				break;
		}
	}

}
