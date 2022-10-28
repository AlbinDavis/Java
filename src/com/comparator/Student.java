package com.comparator;


import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    Integer roll;
    String name;

    Student(Integer roll,String name){
        this.name = name;
        this.roll = roll;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return o.roll -this.roll;
    }

    public Integer getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

}
