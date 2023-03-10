package collection.idesign3;

public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer pincode;


    public Address(String addressLine1, String addressLine2, String city, String state, Integer pincode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public Integer getPincode() {
        return pincode;
    }
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s %s\n",this.addressLine1,this.addressLine2,this.city,this.state,this.pincode);
    }

}
