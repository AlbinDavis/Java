package com.array;
import java.util.Scanner;

public class array_of_objects {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        Student[] arr = new Student[n];
        for(int i=0;i<n;i++) {
            int rollno=s.nextInt();
            s.nextLine();
            String name=s.nextLine();

            arr[i] = new Student(rollno,name);
        }System.out.println("Student data in student:\n");
        for(int i=0;i<n;i++) {
            System.out.println(+arr[i].rollno+" "+arr[i].name);
        }
    }

    static class Student {

        public int rollno;
        public String name;

        Student(int rollno, String name) {
            this.name = name;
            this.rollno = rollno;
        }

    }
}
