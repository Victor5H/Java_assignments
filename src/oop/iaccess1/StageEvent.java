package oop.iaccess1;

public class StageEvent extends Event {
    //write your code here
    private Integer noOfStall;

    public StageEvent(String name, String detail, String type, String ownerName, double costperDay) {
        super(name, detail, type, ownerName, costperDay);
    }

    public Integer getNoOfStall() {
        return noOfStall;
    }

    public void setNoOfStall(Integer noOfStall) {
        this.noOfStall = noOfStall;
    }
}
