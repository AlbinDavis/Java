//Enums is the list of named constants
//constants declared inside are called enumeration constants
//like class having fixed constants and methods
//implicitly static and final
//defines new data type
//created inside or outside the class
package com.Enums;
enum  CovidVaccines{
    COVISHIELD,COVAXIN, SPUTNIK_V, PFIZER
}
public class Enum1 {
    public static void main(String[] args) {
        CovidVaccines cv=CovidVaccines.COVAXIN;
        System.out.println(cv);
    }
}
