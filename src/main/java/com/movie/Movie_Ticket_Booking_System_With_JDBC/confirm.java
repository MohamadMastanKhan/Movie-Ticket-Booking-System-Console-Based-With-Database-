package com.movie.Movie_Ticket_Booking_System_With_JDBC;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entitys.BookingDetails;
import com.Helper.FactoryProvider;

public class confirm {
    static Scanner sc = new Scanner(System.in);
    public static String seat;
    public static float cost;

    public void con() throws Exception {
        this.cost = ((Timing.ticket1 * 100 * 15) / 100 + (Timing.ticket1 * 100) + ((150 * food.piz * (100 - food.co)) / 100));
        System.out.println("\n\t\tNet Payable =\t" + C.yellow + cost + "/-" + C.whitebr);
        System.out.print("\n\t\tEnter" + C.green + C.blink + " 1. GPAY" + C.blue + C.blink + " 2. Paytm" + C.purple + C.blink + " 3. Phonepe" + C.whitebr + " 4. Back\n\t\tEnter: ");
        String a = sc.next();
        switch (a) {
            case "1":
            case "2":
            case "3":
                System.out.print("\n\t\tRedirecting to Payment....");
                System.out.print("\n\t\tEnter UPI Pin Or 1. Exit : ");
                this.seat = new Timing().se(Timing.ticket1);
                pin();
                break;
            case "4":
                food.piz = 0;
                food.co = 0;
                new Login().Back();
                break;
            default:
                System.out.println("\t\tInvalid Data Plz Re-enter");
                con();
                break;
        }
    }

    public void pin() {
        String a = sc.next();
        if (a.equals("1")) {
            System.out.println(C.redbri + "\t\tPayment Declined");
            System.exit(0);
        } else if (a.equals(new upi().getter())) {
            System.out.println(C.yellow + "--------------------------------------------------------------");
            System.out.println(C.cyan + C.blink + "CONGRATULATIONS BOOKING CONFIRMED" + C.whitebr);
            storeBookingDetails();
            Ticket();
        } else {
            System.out.println(C.redbri + C.blink + "\t\tUPI Pin is Not Matched Please Re-enter" + C.whitebr);
            System.out.print("\n\t\tEnter UPI Pin Or 1. Exit : " + C.whitebr);
            pin();
        }
    }

    public void storeBookingDetails() {
        try (Session session = FactoryProvider.getFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            BookingDetails booking = new BookingDetails();
            booking.setLocation(Location.Loc);
            booking.setMovie(Moviename.mov);
            booking.setTheatre(Theatre.the);
            booking.setDate(Timing.date1 + "/" + Timing.month1);
            booking.setShowTime(Timing.show1);
            booking.setSeatNumber(this.seat);
            booking.setTotalCost(cost);
            session.save(booking);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\t\tError storing booking details.");
        }
    }

    public void Ticket() {
        float cgst = (Timing.ticket1 * 100 * 15) / 100;
        System.out.println(C.yellow + "--------------------------------------------------------------" + C.whitebr);
        System.out.println("Location - " + C.redbri + Location.Loc + C.whitebr + ", Movie - " + C.redbri + Moviename.mov + C.whitebr + ", Theatre - " + C.redbri + Theatre.the + C.whitebr + ".");
        System.out.println("Date/Month- " + C.redbri + Timing.date1 + C.whitebr + "/" + C.redbri + Timing.month1 + C.whitebr + ", Show Time- " + C.redbri + Timing.show1 + C.whitebr + ", Seat No- " + C.redbri + this.seat + C.whitebr);
        System.out.println(C.yellow + "--------------------------------------------------------------" + C.whitebr);
        System.out.println("Total Cost = " + C.redbri + cost + "/-" + C.whitebr);
        System.out.println(C.blue + C.blink + "\t\tTHANK YOU FOR VISITING" + C.whitebr);
        System.exit(0);
    }
}
