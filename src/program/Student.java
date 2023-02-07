package program;

public class Student {
    int roll;
    String name;
    String address;
    int sem;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public Student(int roll, String name, String address, int sem) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.sem = sem;
    }
}
