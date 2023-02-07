package DesignPatterns.Builder;

public class Phone {
    private int version;
    private String os;
    private String name;
    private String model;
    private String brand;

    public Phone(int version, String os, String name, String model, String brand) {
        this.version = version;
        this.os = os;
        this.name = name;
        this.model = model;
        this.brand = brand;
    }

}
