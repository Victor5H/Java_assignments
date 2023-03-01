package fundamental.idesign3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat df1 = new SimpleDateFormat("EEE, MMM d, yy");
        DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat in = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String input = sc.next();
        Date date = in.parse(input);
        System.out.println("Date Format with EEE, MMM d, yy : "+df1.format(date));
        System.out.println("Date Format with dd.MM.yyyy : "+df2.format(date));
        System.out.println("Date Format with dd dd/MM/yyyy : "+df3.format(date));
    }
}
