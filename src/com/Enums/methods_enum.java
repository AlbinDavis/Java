package com.Enums;

public class methods_enum {
    public static void main(String[] args) {

        CovidVaccines arr[] = CovidVaccines.values();
        for(CovidVaccines i :arr)
        {
            System.out.println(i + " at index "
                    + i.ordinal());
        }
        System.out.println(CovidVaccines.valueOf("COVAXIN"));
    }
}
