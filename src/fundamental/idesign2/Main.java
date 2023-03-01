package fundamental.idesign2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
        List<Item> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String in = sc.next();
            StringBuilder sb = new StringBuilder(in);
            String[] arr = in.split("\\$");
            list.add(new Item(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
        }
        System.out.println("Items:");

        for (Item i :
                list) {
            System.out.println(i);
        }
    }
}
