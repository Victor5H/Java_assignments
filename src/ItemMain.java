import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemMain {
    public static void main(String[] args)  {
        String name;
        double deposit,cost;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Item type details:");
        System.out.println("Enter the name:");
        try{
            name=br.readLine();
            System.out.println("Enter the deposit:");
            deposit = Double.parseDouble( br.readLine());
            System.out.println("Enter the cost per day:");
            cost = Double.parseDouble( br.readLine());
            System.out.println("The details of the item type are:");
            ItemType i  = new ItemType(name,deposit,cost);
            System.out.println(i);
        }
        catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
    }
}
