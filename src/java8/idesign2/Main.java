package java8.idesign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void display(List<Event> eventList){
        eventList.stream().forEach(n-> System.out.println(n.getEventName()+"|"+n.getOrganizerName()+"|"+n.getEventCost()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        List<Event> list = new ArrayList<>();
        System.out.println("Enter the number of events");
        int n = sc.nextInt();
        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            String [] arr = line.split(",");
            list.add(new Event(arr[0],arr[1],Double.parseDouble(arr[2])));
        }
        display(list);
    }
}
