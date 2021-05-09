package com.input;
import java.util.*;
public class scanner_input {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String name=in.nextLine();//read string
        int id=in.nextInt();//read integer
        System.out.println(name+"\n"+id);
    }
}
