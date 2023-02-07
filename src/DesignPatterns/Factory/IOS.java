package DesignPatterns.Factory;

public class IOS implements Os{

    @Override
    public void getSpec() {
        System.out.println("Secure OS");
    }
}
