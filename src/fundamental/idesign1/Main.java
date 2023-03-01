package fundamental.idesign1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the text from the document");
        String line = sc.nextLine().trim();
        System.out.println(line);
        System.out.println("Enter the string to be found in the data");
        String find = sc.next();
        if(line.contains(find)){
            System.out.println("String is found in the document");
        }
        else {
            System.out.println("String is not found in the document");
        }
    }

}
