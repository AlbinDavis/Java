package DesignPatterns.Singleton;

public class SingletonClass {
    public static SingletonClass obj;
    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if(obj!=null){
            obj = new SingletonClass();
        }
        return obj;

    }

}
