package multithreading.iaccess;

import java.util.*;

public class Frequency {
    private String str;
    private int count;
    private TreeMap<String,Integer> map;
    Frequency(String str){
        this.str=str;
        count=0;
        map = new TreeMap<>();
    }


    public void print() {
        String [] arr = this.str.split("");
        for (String i :
                arr) {
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else {
                int c = map.get(i);
                c++;
                map.replace(i,c);
            }
        }
        for (Map.Entry<String, Integer> entry:
                map.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
    }
}
