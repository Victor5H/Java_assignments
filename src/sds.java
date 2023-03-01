import java.text.ParseException;
import java.util.*;
public class sds {

    public static void main(String[] args) {
        // your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stage event start date and end date");
        List li = List.of();
        Arrays.asList();
        long sdate=0;
        long edate=0;
        String date1,date2;
        date1 = scanner.next();
        sdate = Date.parse(date1);
        date2 = scanner.next();
        edate = Date.parse(date2);

        System.out.println("Start date:"+sdate);
        System.out.println("End date:"+edate);

    }

}
