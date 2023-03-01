package collection.iaccess1;

import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Set<User> set = new HashSet<>();
        System.out.println("Enter number of users:");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name,bank;
            System.out.println("Enter details of user"+(i+1)+"\nUsername:");
            name= sc.next();
            System.out.println("Bank name:");
            bank = sc.next();
            set.add(new User(name,bank));
        }
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String line = sc.next();
        String [] arr= line.split(",");
        set.retainAll(Arrays.asList(arr));
        List<User> li  = new ArrayList<User>(set);
        Collections.sort(li);
        System.out.println("Users going to expire within a month");
        int i=1;
        for(User u:li){
            System.out.println("User "+(i));
            System.out.println(u);
            i++;
        }
    }
}
