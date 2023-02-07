package DesignPatterns.Factory;

public class OsFactory {
    public Os getOs(String name){
        if(name.equals("Open")){
            return new Android();
        }
        else{
            return new IOS();
        }
    }
}
