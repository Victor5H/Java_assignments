package java_8_features.idesign1;

import java.util.*;

class Main
{
    public static void main(String args[]) {
        //Fill your code here
        List<Expenses> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 5; i++) {
            if (i==0){
                String put = "food";
                System.out.println("Enter expense for "+put);
                String line = sc.next();
                list.add(new Expenses("Food",Double.parseDouble(line)));
            }
            if (i==1){
                String put = "rent";
                System.out.println("Enter expense for "+put);
                String line = sc.next();
                list.add(new Expenses(put,Double.parseDouble(line)));
            }
            if (i==2){
                String put = "shopping";
                System.out.println("Enter expense for "+put);
                String line = sc.next();
                list.add(new Expenses(put,Double.parseDouble(line)));
            }
            if (i==3){
                String put = "groceries";
                System.out.println("Enter expense for "+put);
                String line = sc.next();
                list.add(new Expenses(put,Double.parseDouble(line)));
            }
            if (i==4){
                String put = "electricity";
                System.out.println("Enter expense for "+put);
                String line = sc.next();
                list.add(new Expenses(put,Double.parseDouble(line)));
            }
        }
        System.out.println("Enter salary");
        int sal = sc.nextInt();
        double sum = list.stream().map(n->n.getCost()).reduce(0.0,(a,b)->a+b);
        double diff = sal-sum;
        if (diff>=0){
            System.out.println("Savings amount will be Rs."+diff);
        }
        else
            System.out.println("Expenses exceeds Salary");
    }
}

