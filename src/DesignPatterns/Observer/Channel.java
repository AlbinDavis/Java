package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    public void unSubscribe(Subscriber sub){
        subscribers.remove(sub);
    }

    public void notify(String str){
        for(Subscriber sub : subscribers){
            sub.update(str);
        }
    }

    public void addContent(String title){
        this.title = title;
        this.notify(title);
    }

}
