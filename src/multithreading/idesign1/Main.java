package multithreading.idesign1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int total=0;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of lines");
        int n = Integer.parseInt(sc.next());
        List<Article> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            System.out.println("Enter line "+(i+1));
            String line = sc.next();
            list.add(new Article(line));

            total+=list.get(i).getCount();
        }
        System.out.println("There are "+total+" articles in the given input");
    }

}
