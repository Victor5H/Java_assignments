package java_8_features.idesign2;

public class Event {
    private String eventName;
    private String organizerName;
    private double eventCost;

    public Event(String eventName, String organizerName, double eventCost) {
        this.eventName = eventName;
        this.organizerName = organizerName;
        this.eventCost = eventCost;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public double getEventCost() {
        return eventCost;
    }

    public void setEventCost(double eventCost) {
        this.eventCost = eventCost;
    }
}
