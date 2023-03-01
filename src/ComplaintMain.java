import java.util.Scanner;
import java.util.*;

public class ComplaintMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        List<Complaint> list = new ArrayList<>();
        String name="", id="", country="", complaint="";
        String response;
        while (true) {
            System.out.println("Enter the customer name");
            name = sc.next();
            if(name.equals("")){
                System.out.println("Same customer");
            }
            else{
                System.out.println("Enter the id");
                id = sc.next();
                System.out.println("Enter the country");
                country = sc.next();
            }
            System.out.println("Enter the complaint");
            complaint = sc.next();
            System.out.println("Add another complaint ??");
            response = sc.next();
            if (name.equals("")) {
                try {
                    Complaint clone = (Complaint)  list.get(list.size() - 1).clone();
                    System.out.println(clone);
                    clone.setComplaint(complaint);
                    list.add(clone);
                } catch (CloneNotSupportedException e) {
                    System.out.println(e);
                }
            }
            else {
                Customer c = new Customer(name, id, country);
                list.add(new Complaint(complaint, c));
            }
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Complaint Details");
        for (Complaint c : list) {
            c.display();
        }
    }
}
