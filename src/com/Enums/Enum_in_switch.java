package com.Enums;

public class Enum_in_switch {
    public static void main(String[] args) {
        CovidVaccines vaccines =CovidVaccines.COVAXIN;
        switch(vaccines){
            case SPUTNIK_V:
                System.out.println("GOOD");
                break;
            case COVAXIN:
                System.out.println("better");
                break;
            case COVISHIELD:
                System.out.println("very good");
                break;
            case PFIZER:
                System.out.println("best in ava");
                break;
        }
    }
}
