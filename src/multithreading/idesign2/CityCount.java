package multithreading.idesign2;

import java.util.List;

public class CityCount extends Thread {
    private String city;
    private Integer count;
    private List<User> userList;

    public CityCount(String city, List<User> userList) {
        super();
        this.city = city;
        this.count = 0;
        this.userList = userList;
        this.start();
    }


    @Override
    public synchronized void run() {
        for (User u :
                userList) {
            if (u.getCity().equalsIgnoreCase(city)) {
                count++;
            }
        }
    }

    public String getCity() {
        return city;
    }

    public Integer getCount() {
        return count;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


}
