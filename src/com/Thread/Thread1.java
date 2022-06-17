package com.Thread;

public class Thread1 extends Thread{

    MathUtil mu;
    public Thread1(MathUtil mu){
        this.mu=mu;
    }

    @Override
    public void run(){
        try{
            mu.getMultiples(2);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
