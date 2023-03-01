package oop.iaccess2;

public class ExecutiveStall implements Stall {
    //fill your code here
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer screen;

    public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getscreen() {
        return screen;
    }

    public void setscreen(Integer screen) {
        this.screen = screen;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:"+this.stallName +"\n"+
                "Cost:" +this.cost+".Rs\n"+
                "Owner Name:"+this.ownerName+"\n"+
                "Number of Screens:"+this.screen+"\n");
    }
}

