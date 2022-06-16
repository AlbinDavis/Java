package com.Thread;

public class Thread2 implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("thread 1 is running");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
