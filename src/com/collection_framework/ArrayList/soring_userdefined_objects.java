package com.collection_framework.ArrayList;

import java.util.ArrayList;

class Course{
    int id;
    String name;
    int lcount;
    Course(int id,String name,int lcount){
        this.id=id;
        this.name=name;
        this.lcount=lcount;
    }
    public String tostring(){
        return id+" "+name+" "+lcount;
    }
}
public class soring_userdefined_objects {
    public static void main(String[] args) {
        ArrayList<Course> al=new ArrayList<Course>();
        al.add(new Course(1,"java",34));
        al.add(new Course(2,"python",76));
        al.add(new Course(3,"cpp",14));
                for(Course i:al)
                    System.out.println(i.tostring());

    }
}
