package com.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Default sort is ascending here we are doing descending
public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(Arrays.asList(new Student(1,"albin"),
                new Student(2,"blen"),new Student(3,"clex")));
        RollComparator rollComparator = new RollComparator();
        //Comparator by making student class as comparable implements comparable and override compareTo method
        //This will be added in the Student class itself we implement student class with comparable
        Collections.sort(list);
        list.forEach(x-> System.out.println(x.getRoll()));

        //Comparator by implementing comparator interface here we make separate comparator class for each type of comparison
        // RollComparator is created for sorting on the basis of the roll no
        list.sort(rollComparator);
        list.forEach(x-> System.out.println(x.getRoll()));

        //The above can be implemented using the lambda function also so that we can reduce the number of lines and makes it more readable
        //Descending on name of student
        list.sort((Student x,Student y)->y.getRoll().compareTo(x.getRoll()));
        list.forEach(x-> System.out.println(x.getName()));

        //using stream
        List<String> res = list.stream().sorted((x,y)->y.getRoll().compareTo(x.getRoll())).map(Student::getName).collect(Collectors.toList());
        System.out.println("*"+res);
    }
}
