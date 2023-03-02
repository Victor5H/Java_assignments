package streams_and_files.idesign2;

import java.io.*;
import java.util.*;
public class UserBO {

    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
        //write your code here
        for(User u:userList){
            bw.write(u.getName()+","+u.getMobileNumber()+","+u.getUsername()+","+u.getPassword()+"\n");
        }
        bw.close();
    }
}
