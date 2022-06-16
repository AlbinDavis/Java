package com.Thread;

public class Thread1 extends Thread{
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
