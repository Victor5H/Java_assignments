package java_8_features.iaccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter number of bookings");
        List<TicketBooking> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter customer name");
            String name = sc.next();
            System.out.println("Enter number of tickets");
            int ticket = sc.nextInt();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            list.add(new TicketBooking(name,ticket,price));
        }
        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        list.stream().sorted().forEach(e-> System.out.printf("%-10s %-15s %-15s%n",e.getCustomerName(),e.getNoOfTickets(),e.getPrice()));

    }
}
