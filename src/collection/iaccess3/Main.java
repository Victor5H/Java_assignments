package collection.iaccess3;

import org.w3c.dom.ls.LSOutput;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the number of address:");
        int n = sc.nextInt();
        Map<String, Map<String, Integer>> stateMap = new TreeMap<>();
        Map<String, Integer> cityMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the address:");
            String line = sc.next();
            String[] arr = line.split(",");
            String state = arr[2];
            String city = arr[1];
            if (stateMap.containsKey(state)) {
                cityMap = stateMap.get(state);
                if (cityMap.containsKey(city)) {
                    int count = cityMap.get(city) + 1;
                    cityMap.put(city, count);
                    stateMap.put(state, cityMap);
                } else {
                    Map<String, Integer> temp = new TreeMap<>();
                    temp.put(city, 1);
                    stateMap.put(state, temp);
                }
            } else {
                Map<String, Integer> temp = new TreeMap<>();
                stateMap.put(state, temp);
            }
        }
        System.out.println("Number of entries in city/state wise:");
        for (Map.Entry<String, Map<String, Integer>> m : stateMap.entrySet()) {
            System.out.println("State:" + m.getKey());
            Map<String, Integer> city = m.getValue();
            for (Map.Entry<String, Integer> a : city.entrySet()) {
                System.out.println("City:" + a.getKey() + " Count:" + a.getValue());
            }
            System.out.println();
        }
    }


}
