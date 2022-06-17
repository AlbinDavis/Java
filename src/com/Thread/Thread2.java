package com.Thread;

public class Thread2 implements Runnable{

    MathUtil mu;
    public Thread2(MathUtil mu){
        this.mu=mu;
    }

    @Override
    public void run(){
        try{
            mu.getMultiples(3);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
