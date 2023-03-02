package streams_and_files.idesign1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserBO {
    public List<User> readFromFile(BufferedReader br) {
        List<User> list = new ArrayList<>();
        try {
            String line = "";
            while ((line = br.readLine())!=null) {
                String[] arr = line.split(",");
                list.add(new User(arr[0], arr[1], arr[2], arr[3]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void display(List<User> list) {
        list.stream()
                .forEach(u -> System.out.format("%-15s %-20s %-15s %s\n", u.getName(), u.getEmail(), u.getUsername(), u.getPassword()));
    }
}
