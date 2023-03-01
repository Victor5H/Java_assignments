package multithreading.idesign2;

public class User {
    private String name;
    private String mobileNumber;
    private String city;
    private String state;

    public User(String name, String mobileNumber, String city, String state) {
        super();
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.state = state;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getName() {
        return name;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }


}
