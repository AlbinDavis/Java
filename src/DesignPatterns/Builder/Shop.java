package DesignPatterns.Builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setName("POCO").setOs("Android").setModel("M2pro").getPhone();
        System.out.println(phone);
    }

}
