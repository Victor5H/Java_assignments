package oop.iaccess2;

import java.util.*;
public class Main {
    public static void main(String[] args){
        // fill your code here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Choose Stall Type\n" +
                "1)Gold Stall\n" +
                "2)Premium Stall\n" +
                "3)Executive Stall");
        int ch = sc.nextInt();

        if(ch==1){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
            String data = sc.next();
            String [] dataArr=data.split(",");
            GoldStall gs = new  GoldStall(dataArr[0],Integer.parseInt(dataArr[1]),dataArr[2],Integer.parseInt(dataArr[3]));
            gs.display();
        }
        else if(ch==2){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
            String data = sc.next();
            String [] dataArr=data.split(",");
            PremiumStall ps = new  PremiumStall(dataArr[0],Integer.parseInt(dataArr[1]),dataArr[2],Integer.parseInt(dataArr[3]));
            ps.display();
        }
        else if(ch==3){
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
            String data = sc.next();
            String [] dataArr=data.split(",");
            ExecutiveStall es = new ExecutiveStall(dataArr[0],Integer.parseInt(dataArr[1]),dataArr[2],Integer.parseInt(dataArr[3]));
            es.display();
        }
        else{
            System.out.println("Invalid Stall Type");
        }
    }
}
