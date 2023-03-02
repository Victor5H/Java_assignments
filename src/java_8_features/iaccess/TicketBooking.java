package java_8_features.iaccess;

class TicketBooking implements Comparable{
    private String customerName;
    private Integer noOfTickets;
    private Double price;

    public TicketBooking(String customerName, Integer noOfTickets, Double price) {
        this.customerName = customerName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }

    String getCustomerName(){
        return this.customerName;
    }
    Integer getNoOfTickets(){
        return this.noOfTickets;
    }
    Double getPrice(){
        return this.price;
    }
    public String toString() {
        return String.format("%-10s %-15s %-15s\n",this.getCustomerName(),this.getNoOfTickets(),this.getPrice());
    }
    public int compareTo(Object ob){
        TicketBooking tb = (TicketBooking) ob;
        return (int) (this.getPrice() - ((TicketBooking) ob).getPrice());
    }
}
