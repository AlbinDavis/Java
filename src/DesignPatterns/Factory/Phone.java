package DesignPatterns.Factory;

public class Phone {
    public static void main(String[] args) {
        OsFactory osFactory = new OsFactory();
        Os os = osFactory.getOs("Open");
        os.getSpec();
    }
}
