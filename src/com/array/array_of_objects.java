package com.array;
import java.util.Scanner;

class Student{

    public int rollno;
    public String name;
    Student(int rollno,String name){
        this.name=name ;
        this.rollno=rollno;
    }
}

public class array_of_objects {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Student[] arr = new Student[2];
        for(int i=0;i<n;i++) {
            String name=s.nextLine();
            int rollno=s.nextInt();
            arr[i] = new Student(rollno,name);
        }
        for(int i=0;i<2;i++) {
            System.out.println("Student data in student: "+arr[i].rollno+" "+arr[i].name);
        }
    }
}
