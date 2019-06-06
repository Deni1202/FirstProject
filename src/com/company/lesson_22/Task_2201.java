package com.company.lesson_22;

/*
 Задача по алгоритмам. Факториал
 Найти факториал числа 10
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_2201 {
    public static void main(String[] args){
        result(allNumber());
    }
    private static List<Integer>allNumber(){
        List<Integer> number = new ArrayList<>();
        for(int i = 1; i<=10;i++){
            number.add(i);
        }
        return number;
    }
    private static void result(List<Integer>list){
        int num = 1;
        for(int i = 1;i<list.size();i++){
            num = num*list.get(i);
        }
        System.out.println(num);
    }
}
