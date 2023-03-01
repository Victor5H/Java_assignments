package collection.iaccess1;

public class User implements Comparable{
    private String username;
    private String bankname;

    public User(){
    }

    public User(String username, String bankname) {
        super();
        this.username = username;
        this.bankname = bankname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Override
    public int compareTo(Object o) {
        User u = (User) o;
        return this.getUsername().compareTo(u.getUsername());
    }

    @Override
    public boolean equals(Object obj) {
        return this.getUsername().hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "User Name = "+this.getUsername()+"\nBank Name = "+this.getBankname();
    }
}
