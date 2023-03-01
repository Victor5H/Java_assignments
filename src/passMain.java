
import exception.iaccess2.User;
import exception.iaccess2.UserBO;
import exception.iaccess2.WeakPasswordException;

import java.io.*;

public class passMain {

    public static void main(String[] args)throws IOException {
        //Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the user details");
        String input = br.readLine();
        String [] arr = input.split(",");
        User user = new User(arr[0],arr[1],arr[2],arr[3]);
        try{
            UserBO.validate(user);
            System.out.println(user);
        }
        catch(WeakPasswordException e){
            System.out.println(e);
        }
    }

}
