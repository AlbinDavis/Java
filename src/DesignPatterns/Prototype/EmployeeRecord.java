package DesignPatterns.Prototype;

public class EmployeeRecord implements Prototype {
    private int id;
    private String name, designation;
    private double salary;
    private String address;


    public  EmployeeRecord(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void showRecord(){

        System.out.println(id+"\t"+name+"\t"+salary);
    }

    @Override
    public EmployeeRecord getClone() {

        return new EmployeeRecord(id,name,salary);
    }
}
