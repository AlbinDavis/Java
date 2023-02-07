package DesignPatterns.Builder;

public class PhoneBuilder {
    private int version;
    private String os;
    private String name;
    private String model;
    private String brand;

    public PhoneBuilder setVersion(int version) {
        this.version = version;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Phone getPhone(){
        return new Phone(version,os,name,model,brand);
    }
}
