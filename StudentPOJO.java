public class StudentPOJO {
    private String name;
    private int rollNumber;
    private String marks;
    private int regID;

    public StudentPOJO(String name, int rollNumber, String marks, int regID) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.regID = regID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public int getRegID() {
        return regID;
    }

    public void setRegID(int regID) {
        this.regID = regID;
    }
}
