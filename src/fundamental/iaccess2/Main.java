package fundamental.iaccess2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Event> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of Events");
        int n = sc.nextInt();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter event details in CSV(oop.iaccess1.Event Name,Start Date,End Date) Date:dd/MM/yyyy");
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            String [] arr = line.split(",");
            try {
                list.add(new Event(arr[0],df.parse(arr[1]),df.parse(arr[2])));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
        boolean flag=false;
        System.out.println("1-day Events:");
        for (int i = 0; i < n; i++) {
            Date date1 = list.get(i).getStartDate();
            Date date2  = list.get(i).getEndDate();
            long diff = date2.getTime()-date1.getTime();
//            System.out.println(diff);
            System.out.println(Duration.between(date1.toInstant(),date2.toInstant()).toDays());
            if(diff==0){
                System.out.println(list.get(i).getEventName());
                flag=true;
            }
        }
        if (!flag){
            System.out.println("No Events");
        }
    }
}
