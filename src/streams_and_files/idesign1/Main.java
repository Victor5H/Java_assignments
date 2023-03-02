package streams_and_files.idesign1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        UserBO userBO = new UserBO();
        System.out.format( "%-15s %-20s %-15s %s\n","Name","Email","Username","Password");
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/streams_and_files/idesign1/input.csv"));
            userBO.display(userBO.readFromFile(br));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
