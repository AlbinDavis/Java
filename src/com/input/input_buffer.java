package com.input;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class input_buffer {
    public static void main(String[] args) throws IOException {
        //BufferedReader in =new BufferedReader(new FileReader("a.txt")); read file
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        String a = in.readLine();
        System.out.println(a);
    }

}
