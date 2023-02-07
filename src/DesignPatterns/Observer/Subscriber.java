package DesignPatterns.Observer;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public void update(String str){
        System.out.println(name+" "+"New video has been uploaded:"+str);
    }

    public void updateChannel(Channel ch){
        this.channel = ch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
