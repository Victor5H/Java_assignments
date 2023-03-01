package exception.iaccess1;

import java.util.*;
import java.text.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        // your code here
        Date date1=null,date2=null;
        DateFormat  df= new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        try{
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the stage event start date and end date");
            String sdate= sc.readLine();
            String edate = sc.readLine();
            date1=df.parse(sdate);
            date2=df.parse(edate);
            System.out.println("Start date:"+df.format(date1));
            System.out.println("End date:"+df.format(date2));
        }
        catch(ParseException e)	{
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}
