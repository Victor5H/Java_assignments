public class Customer {
    private String name;
    private String id;
    private String country;

    public Customer(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }
    public Customer(){

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }
}
