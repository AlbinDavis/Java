package com.Thread;

public class MathUtil {

    synchronized void getMultiples(int n)  {
       // synchronized(this){ synchronization for a block of code
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
            }
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }



    }
}
