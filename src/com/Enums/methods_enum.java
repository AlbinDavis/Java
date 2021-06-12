package com.Enums;

public class methods_enum {
    public static void main(String[] args) {

        for(CovidVaccines i :CovidVaccines.values())
        {
            System.out.println(i + " at index "
                    + i.ordinal());
        }
        System.out.println(CovidVaccines.valueOf("COVAXIN"));
    }
}
