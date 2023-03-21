package oop.iaccess1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter your choice:\n" +
                "1.Exhibition event\n" +
                "2.Stage event");
        int ch = sc.nextInt();
        if (ch==1) {
            System.out.println("Enter the details of exhibition:");
            String data = sc.next();
            String[] arr = data.split(",");
            System.out.println("Enter the starting date of the event:");
            String sd = sc.next();

            Date date1 = null;
            try {
                //Parsing the String
                date1 = dateFormat.parse(sd);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Enter the ending date of the event:");
            String ed = sc.next();
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(ed);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            long time_difference = date2.getTime() - date1.getTime();
            // Calucalte time difference in days
            long days_difference = (time_difference / (1000 * 60 * 60 * 24)) % 365;
            double costPD = Double.parseDouble(arr[4]);
            double gst = (costPD * 5 / 100) * days_difference;
            System.out.println("The GST to be paid is Rs." + gst);
        }
        else if (ch==2) {
            System.out.println("Enter the details of stage event:");
            String data = sc.next();
            String[] arr = data.split(",");
            System.out.println("Enter the starting date of the event:");
            String sd = sc.next();

            Date date1 = null;
            try {
                //Parsing the String
                date1 = dateFormat.parse(sd);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Enter the ending date of the event:");
            String ed = sc.next();
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(ed);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // Calucalte time difference in days
            long days_difference = Duration.between(date1.toInstant(), date2.toInstant()).toDays();
            double costPD = Double.parseDouble(arr[4]);
            double gst = (costPD * 15 / 100) * days_difference;
            System.out.println("The GST to be paid is Rs." + gst);
        }
    }
}