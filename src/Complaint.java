public class Complaint implements Cloneable {
    private String complaint;
    private Customer customer;

    public Complaint() {

    }

    public Complaint(String complaint, Customer customer) {
        this.complaint = complaint;
        this.customer = customer;
    }
    public Complaint (Complaint c){
        this.complaint = c.complaint;
        this.customer = c.customer;
    }

    public void display() {
        System.out.println("Name : " + this.customer.getName() +
                " ID : " + this.customer.getId() +
                " Country : " + this.customer.getCountry() +
                " Complaint : " + this.complaint);
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}

