package DesignPatterns.Observer;

public class Youtube {
    public static void main(String[] args) {
        Subscriber sb1 = new Subscriber();
        Subscriber sb2 = new Subscriber();
        Subscriber sb3 = new Subscriber();
        Subscriber sb4 = new Subscriber();


        Channel abc = new Channel();

        sb1.setName("bibin");
        sb1.updateChannel(abc);
        abc.subscribe(sb1);

        sb2.setName("alen");
        sb2.updateChannel(abc);
        abc.subscribe(sb2);

        sb3.setName("ales");
        sb3.updateChannel(abc);
        abc.subscribe(sb3);

        sb4.setName("abu");
        sb4.updateChannel(abc);
        abc.subscribe(sb4);


        abc.addContent("Design Patterns");



    }
}
