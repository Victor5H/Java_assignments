package oop.iaccess1;

public class Event {
    //write your code here
    private String name;
    private String detail;
    private String type;
    private String ownerName;
    private double costperDay;

    public Event(String name, String detail, String type, String ownerName, double costperDay) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costperDay = costperDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getCostperDay() {
        return costperDay;
    }

    public void setCostperDay(double costperDay) {
        this.costperDay = costperDay;
    }
}

