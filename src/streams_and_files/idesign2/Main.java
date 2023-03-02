package streams_and_files.idesign2;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        //write your code here
        File file = new File("src/streams_and_files/idesign2/output.csv");
        BufferedWriter bw =null;
        try{
            file.createNewFile();
            bw = new BufferedWriter(new FileWriter(file));
            ArrayList<User> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Enter the number of users:");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter the details of user :"+(i+1));
                String line = sc.next();
                String [] arr = line.split(",");
                list.add(new User(arr[0],arr[1],arr[2],arr[3]));
            }
            UserBO ub = new UserBO();
            UserBO.writeFile(list,bw);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
