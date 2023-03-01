package multithreading.idesign2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of users:");
        List<User>list= new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of user "+(i+1));
            String line = sc.next();
            String [] arr= line.split(",");
            list.add(new User(arr[0],arr[1],arr[2],arr[3]));
        }
        System.out.println("Enter the number of cities:");
        int cityn = sc.nextInt();
        Map<String,Integer> map  = new LinkedHashMap<>();
        for (int i = 0; i < cityn; i++) {
            System.out.println("Enter the name of city "+(i+1));
            String city = sc.next();
            CityCount c =new CityCount(city,list);
            try {
                c.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(city,c.getCount());
        }
        for (Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println(entry.getKey()+"--"+entry.getValue());

    }

}
