**Console-Based Movie Ticket Booking System**

**Overview**

This is a Java-based console application for booking movie tickets, integrating Hibernate ORM for database management. The system follows object-oriented principles and allows users to book tickets, apply coupons, make payments via UPI, and store booking details in a database.

**Features**

User Authentication: Signup, login, reset credentials.

Movie Booking: Select location, movie, theatre, date, and showtime.

Seat Allocation: Dynamic seat assignment.

Payment Integration: Supports GPay, Paytm, and PhonePe via UPI.

Discounts: Apply coupons for discounts.

Food Ordering: Option to add food to booking.

Database Management: Stores bookings using Hibernate ORM.

**Project Structure:**

📂 src/com/movie/Movie_Ticket_Booking_System_With_JDBC
 ┣ 📂 com.Entitys
 ┃ ┣ 📜 BookingDetails.java  
 ┃ ┣ 📜 LoginCredentials.java  
 ┣ 📂 com.Helper
 ┃ ┣ 📜 FactoryProvider.java  
 ┣ 📂 com.movie
 ┃ ┣ 📜 Login.java  
 ┃ ┣ 📜 Theatre.java  
 ┃ ┣ 📜 Timing.java  
 ┃ ┣ 📜 Coupons.java  
 ┃ ┣ 📜 UPI.java  
 ┃ ┣ 📜 Confirm.java  
 ┗ 📜 hibernate.cfg.xml  (Database Configuration)

**System Architecture**

**Entity Classes:**

BookingDetails - Stores booking info.

LoginCredentials - Manages user authentication.

**Utility Classes:**

FactoryProvider - Manages Hibernate session factory.

**Core Functionalities:**

Login - Handles user authentication.

Theatre - Defines theatres and timings.

Coupons - Manages discounts.

UPI - Handles payment authentication.

Confirm - Finalizes booking and generates ticket receipt.

Technologies Used

Java (Core & Advanced)

Hibernate (ORM for database interaction)

Maven (Project build management)

MySQL (Database storage)

Eclipse/IntelliJ IDEA (Development environment)

Setup Instructions

Database Configuration

Update hibernate.cfg.xml with MySQL credentials.

Create required tables (booking_details, login_credentials).

Run the Application

Open the project in Eclipse/IntelliJ.

Run the main class.

Follow console prompts to book a movie ticket.

Test Booking

Login or create an account.

Select movie details and apply coupons.

Proceed with UPI payment.

Booking confirmation and ticket details will be stored in the database.

**Conclusion**

This project demonstrates a structured Java application implementing OOP principles, database management with Hibernate, and an interactive movie ticket booking system.

