package DesignPatterns.Prototype;

public class ProtoMain {
    public static void main(String[] args) {
        EmployeeRecord e1 = new EmployeeRecord(1,"alen",200000);
        e1.showRecord();

        EmployeeRecord e2 = e1.getClone();
        e2.showRecord();
    }
}
