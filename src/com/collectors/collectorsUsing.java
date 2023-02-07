package com.collectors;

import com.comparator.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class collectorsUsing {
    public static void main(String[] args) {
        Student ob1= new Student(22,"alen");
        List<Student> studentList = List.of(new Student(22,"alen"),new Student(21,"alex"),new Student(24,"alen"),new Student(82,"alex"));
        List<Integer> list = List.of(1,2,3,5,4,5,6,7);
        List<Integer> result = list.stream().filter(x->x%2==0).collect(toList());// also toSet
        System.out.println(result);

        //Grouping based on the name of student and getting age on that names.
        Map<String,List<Integer>> result2 = studentList.stream().collect(groupingBy(Student::getName,mapping(Student::getRoll,toList())));
        System.out.println(result2);

    }
}
