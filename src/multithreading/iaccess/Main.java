package multithreading.iaccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter Number of Counters :");
        List<Frequency> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter text for counter "+(i+1)+":");
            String l = sc.next();
            list.add(new Frequency(l));
        }
        int i=0;
        for (Frequency f :
                list) {
            System.out.println("Counter "+(++i)+" Result :");
            f.print();
            System.out.println();
        }
    }
}
