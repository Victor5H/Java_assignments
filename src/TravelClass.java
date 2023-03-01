public class TravelClass implements Comparable{
    private String name;
    private String description;

    public TravelClass(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public int compareTo(Object ob){
        TravelClass tc = (TravelClass) ob;
        return (this.getName().compareTo(tc.getName()))*-1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
