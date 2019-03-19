package com.company.lesson_03;

/**
 * Created by User on 19.03.2019.
 */
public class Test_1 {
    public static void main(String[] args){
        System.out.println(sum(3,5));
        System.out.println(res(6,5));
        System.out.println(sqr(4,5));
        System.out.println(def(10,5));

    }
    public static int sum (int number1, int number2){
        return number1 + number2;
    }
    public static int res (int number1, int number2){
        return number1 - number2;
    }
    public static int sqr (int number1, int number2){
        return number1 * number2;
    }
    public static int def (int number1, int number2){
        return number1 / number2;
    }
}
