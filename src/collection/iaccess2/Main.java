package collection.iaccess2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of User details to be added");
        int n = sc.nextInt();
        UserBO list = new UserBO();
        list.addAll(UserBO.getList());
        for(int i=0;i<n;i++) {
            System.out.println("Enter the user "+(i+1)+" detail in csv format");
            String in = sc.next();
            String [] arr = in.split(",");
            list.add( new User(arr[0],arr[1],arr[2],arr[3]));
        }
        System.out.println("Name                Contact Number      Username            Email");
        for(User u: list) {
            u.display();
        }
        System.out.println("Enter the range to be removed from array list");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        list.removeUser(n1,n2);
        System.out.println("Name                Contact Number      Username            Email");
        for(User u: list) {
            u.display();
        }
    }
}
