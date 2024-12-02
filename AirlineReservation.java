import java.awt.event.ActionListener;
import java.util.Scanner;
class Booking {
    public static String name;
    public static String seat_number;
}

class Customer extends Booking {
    public int passenger_id;
    public void startBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger ID: ");
        this.passenger_id = sc.nextInt();
        System.out.println("Enter Passenger Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter Seat Number: ");
        this.seat_number = sc.nextLine();
    }
    public void alterBooking() {
        System.out.println("You don't have the privilige to do it");
    }
}

class Airline extends Booking {
    public String staff_id;
    public void startBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staff ID: ");
        this.staff_id = sc.nextLine();
        System.out.println("Enter Passenger Name: ");
        this.name = sc.nextLine();
        System.out.println("Enter name: ");
    }
}

public class AirlineReservation extends JFrame implements ActionListener {

}