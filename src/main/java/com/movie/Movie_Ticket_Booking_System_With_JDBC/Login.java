package com.movie.Movie_Ticket_Booking_System_With_JDBC;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Entitys.LoginCredentials;
import com.Helper.FactoryProvider;

public class Login extends template
{
	public static Scanner sc = new Scanner(System.in);
	public static User obj1 = new User();
	public void m1()
	{
		System.out.println(C.redbr+"\n\n\n					******************************************************\n");
		System.out.println(C.redbr+"					--------"+C.cyan+C.blink+C.ul+"WELCOME TO MOVIE TICKET BOOKING SYSTEM"+C.redbr+"--------\n");
		System.out.println(C.redbr+"					******************************************************");
	}
	public void Any(String a) throws Exception
	{
		switch(a)
		{
			case "1":
				System.out.print(C.redbri+"\n	Please Enter Username Or Enter 1.Back: "+C.whitebr);
				Login1();
				break;
			case "2":
				SignUp();
				break;
			case "3":
				System.out.print(C.redbri+"\n	Please Enter Username Or Enter 1.Back: "+C.whitebr);		
				Reset1();
				break;
			case "4":
				System.out.println("\n	Exit Successfull");
				System.exit(0);
			default:
				System.out.println(C.whitebr+"\n					Invalid Data Re-Enter any one of the Option Given Below       ");
				System.out.print("\n					1. Login   2.Signup  3. Reset Password  4. Exit :");
				Any(sc.next());
				break;
		}
	}
	public void SignUp() {
        System.out.print("\n\tEnter a new Username: ");
        String username = sc.next();

        try (Session session = FactoryProvider.getFactory().openSession()) {
            Query<LoginCredentials> query = session.createQuery("FROM LoginCredentials WHERE username = :username", LoginCredentials.class);
            query.setParameter("username", username);
            LoginCredentials existingUser = query.uniqueResult();

            if (existingUser != null) {
                System.out.println("\n\tUsername already exists. Please try again.");
                SignUp();
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\tError occurred during signup.");
            return;
        }

        System.out.print("\n\tEnter a new Password: ");
        String password = sc.next();

        LoginCredentials newUser = new LoginCredentials();
        newUser.setUsername(username);
        newUser.setPass(password);

        try (Session session = FactoryProvider.getFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(newUser);
            tx.commit();
            System.out.println("\n\tSignup Successful! Please login.");
            Login1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\tSignup failed due to an error.");
        }
    }
	public void Login1() throws Exception {
        System.out.print("\n\tPlease Enter Username Or Enter 1.Back: ");
        String username = sc.next();

        if (username.equals("1")) {
            log();
            return;
        }

        try (Session session = FactoryProvider.getFactory().openSession()) {
            Query<LoginCredentials> query = session.createQuery("FROM LoginCredentials WHERE username = :username", LoginCredentials.class);
            query.setParameter("username", username);
            LoginCredentials user = query.uniqueResult();

            if (user == null) {
                System.out.println("\n\tInvalid Username. Please try again.");
                Login1();
                return;
            }

            System.out.print("\n\tPlease Enter Password Or Enter 1.Back: ");
            String password = sc.next();

            if (password.equals("1")) {
                log();
                return;
            }

            if (user.getPass().equals(password)) {
                System.out.println("\n\tLogin Successful");
                Location loc = new Location();
                System.out.println("\n\tPlease Enter any one of the Location Given Below OR Select 4. Logout");
                System.out.print("\t\t1. Hyderabad\n\t\t2. Mumbai\n\t\t3. Vizag\n\t\tEnter: ");
                loc.m1(sc.next());
            } else {
                System.out.println("\n\tInvalid Password. Please try again.");
                Login1();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\tLogin failed due to an error.");
        }
    }
	public void Login2() throws Exception {
        System.out.print("\n\tPlease Enter Username Or Enter 1.Back: ");
        String username = sc.next();

        if (username.equals("1")) {
            log();
            return;
        }

        try (Session session = FactoryProvider.getFactory().openSession()) {
            Query<LoginCredentials> query = session.createQuery("FROM LoginCredentials WHERE username = :username", LoginCredentials.class);
            query.setParameter("username", username);
            LoginCredentials user = query.uniqueResult();

            if (user == null) {
                System.out.println("\n\tInvalid Username. Please try again.");
                Login2();
                return;
            }

            System.out.print("\n\tPlease Enter Password Or Enter 1.Back: ");
            String password = sc.next();

            if (password.equals("1")) {
                log();
                return;
            }

            if (user.getPass().equals(password)) {
                System.out.println("\n\tLogin Successful");
                Location loc = new Location();
                System.out.println("\n\tPlease Enter any one of the Location Given Below OR Select 4. Logout");
                System.out.print("\t\t1. Hyderabad\n\t\t2. Mumbai\n\t\t3. Vizag\n\t\tEnter: ");
                loc.m1(sc.next());
            } else {
                System.out.println("\n\tInvalid Password. Please try again.");
                Login2();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\tLogin failed due to an error.");
        }
    }
	public void Login3() throws Exception {
        System.out.print("\n\tPlease Enter Username Or Enter 1.Back: ");
        String username = sc.next();

        if (username.equals("1")) {
            log();
            return;
        }

        try (Session session = FactoryProvider.getFactory().openSession()) {
            Query<LoginCredentials> query = session.createQuery("FROM LoginCredentials WHERE username = :username", LoginCredentials.class);
            query.setParameter("username", username);
            LoginCredentials user = query.uniqueResult();

            if (user == null) {
                System.out.println("\n\tInvalid Username. Please try again.");
                Login3();
                return;
            }

            System.out.print("\n\tPlease Enter Password Or Enter 1.Back: ");
            String password = sc.next();

            if (password.equals("1")) {
                log();
                return;
            }

            if (user.getPass().equals(password)) {
                System.out.println("\n\tLogin Successful");
                Location loc = new Location();
                System.out.println("\n\tPlease Enter any one of the Location Given Below OR Select 4. Logout");
                System.out.print("\t\t1. Hyderabad\n\t\t2. Mumbai\n\t\t3. Vizag\n\t\tEnter: ");
                loc.m1(sc.next());
            } else {
                System.out.println("\n\tInvalid Password. Please try again.");
                Login3();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\tLogin failed due to an error.");
        }
    }
	public void Reset1() {
        System.out.print("\n\tEnter Username: ");
        String username = sc.next();
        resetPassword(username);
    }

    public void Reset2() {
        System.out.print("\n\tEnter Username for Reset2: ");
        String username = sc.next();
        resetPassword(username);
    }

    public void Reset3() {
        System.out.print("\n\tEnter Username for Reset3: ");
        String username = sc.next();
        resetPassword(username);
    }

    private void resetPassword(String username) {
        try (Session session = FactoryProvider.getFactory().openSession()) {
            Query<LoginCredentials> query = session.createQuery("FROM LoginCredentials WHERE username = :username", LoginCredentials.class);
            query.setParameter("username", username);
            LoginCredentials user = query.uniqueResult();

            if (user == null) {
                System.out.println("\n\tUsername not found. Please try again.");
                return;
            }

            System.out.print("\n\tEnter Old Password: ");
            String oldPassword = sc.next();
            if (!user.getPass().equals(oldPassword)) {
                System.out.println("\n\tInvalid Old Password. Please try again.");
                return;
            }

            System.out.print("\n\tEnter New Password: ");
            String newPassword = sc.next();

            Transaction tx = session.beginTransaction();
            user.setPass(newPassword);
            session.update(user);
            tx.commit();
            System.out.println("\n\tPassword Reset Successful!");
            Login1();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n\tPassword Reset failed due to an error.");
            Reset1();
        }
    }
	public void Back() throws Exception
	{
		Location loc = new Location();
		System.out.println(C.redbri+"\n	Please Enter any one of the Location Given Below OR Select 4. Logout");
		System.out.print(C.whitebr+"		1. Hyderabad\n		2. Mumbai\n		3. Vizag\n		Enter: ");
		loc.m1(sc.next());
	}
	public void log() throws Exception
	{
		System.out.println(C.whitebr+"\n					Please Enter any one of the Option Given Below       ");
		System.out.print("\n					1. Login   2.Signup  3. Reset Password  4. Exit: ");
		Any(sc.next());
	}
	public void log1() throws Exception
	{
		m1();
		log();
	}
	public static void start() throws Exception
	{
		Login obj = new Login();
		obj.m1();
		obj.log();
	}
}
