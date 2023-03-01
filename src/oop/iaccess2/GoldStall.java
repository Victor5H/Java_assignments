package oop.iaccess2;

public class GoldStall implements Stall {
    //fill your code here
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer tvSet;

    public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
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

    public Integer getTvSet() {
        return tvSet;
    }

    public void setTvSet(Integer tvSet) {
        this.tvSet = tvSet;
    }

    @Override
    public void display() {
        System.out.println("Stall Name:"+this.stallName +"\n"+
                "Cost:" +this.cost+".Rs\n"+
                "Owner Name:"+this.ownerName+"\n"+
                "Number of TV sets:"+this.tvSet+"\n");
    }
}

