package com.company.lesson_03;

/**
 * Created by User on 19.03.2019.
 */
public class Test_3 {
    public static void main(String[] args){
    System.out.println(percent(100));
    }
    public static double percent(double number){
        double tenPercent = 0.1;
        double result = number + (number * tenPercent);
        return result;
    }
}
