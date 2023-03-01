package fundamental.iaccess1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter the code");
        Map<String,String> map = new TreeMap<>();
        map.put("DH","DEL");
        map.put("MB","MUB");
        map.put("KL","KOL");
        String in = sc.next();
        StringBuilder sb = new StringBuilder(in);
        if (sb.length()<7){
            while (sb.length()!=7){
                sb.insert(2,"0");
            }
        }
        sb.replace(0,2,map.get(sb.substring(0,2)));
        System.out.println("Formatted code");
        System.out.println(sb);
    }
}
