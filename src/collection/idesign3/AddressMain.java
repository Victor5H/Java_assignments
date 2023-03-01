package collection.idesign3;

import java.util.*;
public class AddressMain {

    public static void main(String[] args) throws Exception{
        //Your code here
        Map<String,List<Address>> map = new LinkedHashMap<>();
        Scanner br = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of address");
        int n = br.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the address "+(i+1)+" detail");
            String str = br.next();
            String [] arr = str.split(",");
            Address a =  new Address(arr[0],arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
            String city = arr[2];
            if(map.get(city)==null){
                List<Address> l = new ArrayList<>();
                l.add(a);
                map.put(city,l);
            }
            else{
                List<Address> l = map.get(city);
                l.add(a);
                map.put(city,l);
            }
        }
        System.out.println("Enter the city to be searched");
        String search = br.next();
        if(map.get(search)!=null)	{
            System.out.println("Line 1          Line 2          City            State           Pincode");
            List<Address> l = map.get(search);
            for(Address s: l){
                System.out.print(s);
            }
        }
        else{
            System.out.println("Searched city not found");
        }
    }

}
