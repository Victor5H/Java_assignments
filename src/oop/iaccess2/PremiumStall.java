package oop.iaccess2;

public class PremiumStall implements Stall {
    //fill your code here
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer projector;

    public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
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

    public Integer getprojector() {
        return projector;
    }

    public void setprojector(Integer projector) {
        this.projector = projector;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:"+this.stallName +"\n"+
                "Cost:" +this.cost+".Rs\n"+
                "Owner Name:"+this.ownerName+"\n"+
                "Number of Projectors:"+this.projector+"\n");
    }
}

