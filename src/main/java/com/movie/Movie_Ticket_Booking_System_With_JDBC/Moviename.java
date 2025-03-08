package com.movie.Movie_Ticket_Booking_System_With_JDBC;

import java.util.Scanner;

public class Moviename 
{
    	static Scanner sc = new Scanner(System.in);
		public static String mov;
		public void moviesH() throws Exception
		{
			switch(sc.next())
			{
				case "1":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. Prasad Imax or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="Salaar";
					Theatre ob1 = new Theatre();
					ob1.theatre1();
					break;
				case "2":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. Sudarshan 35mm or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="RRR";
					Theatre ob2 = new Theatre();
					ob2.theatre2();
					break;
				case "3":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. Prasad Imax or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="THE NUN";
					Theatre ob3 = new Theatre();
					ob3.theatre1();
					break;
				case "4":
					Location obj = new Location();
					System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
					System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
					obj.m1(sc.next());
					break;
				case "5":
					System.out.println("		Logout Successfully");
					new Login().log1();
					break;
				default:
					System.out.println(C.redbri+C.blink+"\n		Invalid Data Please RE-Enter "+C.whitebr);
					System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Salaar\n			2. RRR\n			3. THE NUN\n			Enter: ");
					moviesH();
			}
		}
		public void moviesM() throws Exception
		{
			switch(sc.next())
			{
				case "1":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. PVR or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="Jailer";
					Theatre ob1 = new Theatre();
					ob1.theatre3();
					break;
				case "2":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. INOX or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="Animal";
					Theatre ob2 = new Theatre();
					ob2.theatre4();
					break;
				case "3":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. PVR or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="OG";
					Theatre ob3 = new Theatre();
					ob3.theatre3();
					break;
				case "4":
					Location obj = new Location();
					System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
					System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
					obj.m1(sc.next());
					break;
				case "5":
					System.out.println("		Logout Successfully");
					new Login().log1();
					break;
				default:
					System.out.println(C.redbri+C.blink+"\n		Invalid Data Please RE-Enter "+C.whitebr);
					System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. Jailer\n			2. Animal\n			3. OG\n			Enter: ");
					moviesM();
			}
		}
		public void moviesV() throws Exception
		{
			switch(sc.next())
			{
				case "1":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. MELODY or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="LEO";
					Theatre ob1 = new Theatre();
					ob1.theatre5();
					break;
				case "2":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. Cinepolis or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="Tiger-3";
					Theatre ob2 = new Theatre();
					ob2.theatre6();
					break;
				case "3":
					System.out.print(C.redbri+"\n		Please Enter Theatre 1. MELODY or 2. Back 3. Logout\n"+C.whitebr+"		Enter: ");
					this.mov="Jawan";
					Theatre ob3 = new Theatre();
					ob3.theatre5();
					break;
				case "4":
					Location obj = new Location();
					System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
					System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
					obj.m1(sc.next());
					break;
				case "5":
					System.out.println("		Logout Successfully");
					new Login().log1();
					break;
				default:
					System.out.println(C.redbri+C.blink+"\n		Invalid Data Please RE-Enter "+C.whitebr);
					System.out.print(C.redbri+"\n		Enter Any one you like to Watch OR Select 4. Back 5. Logout\n"+C.whitebr+"			1. LEO\n			2. Tiger-3\n			3. Jawan\n			Enter: ");
					moviesV();
			}
		}
}
