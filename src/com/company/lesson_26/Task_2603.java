package com.company.lesson_26;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_2603 {
    public static void main(String[]args) throws IOException {
        String[] arr = myList();
        sort(arr);
    }
    private static String[] myList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] allItem = new String[8];
        for(int i = 0; i<8;i++) {
            allItem[i]= reader.readLine();
        }
        return allItem;

    }
    private static void sort(String[] array){
        int count = 0;
        int count2 = 0;
        for (int i = 0; i <array.length; i++) {
            if(!isNumber(array[i])){
                count++;
                for (int j = 0; j < count; j++) {
                    if(!isNumber(array[j])){

                        if(isGreaterThen(array[i],array[j])){
                            String res = array[i];
                            array[i] = array[j];
                            array[j] = res;

                        }
                    }
                }
            } else {
                count2++;
                for (int j = 0; j <count2; j++) {
                    if(isNumber(array[i])){
                        if(Integer.parseInt(array[i])<Integer.parseInt(array[j])){
                            String res2 = array[i];
                            array[i] = array[j];
                            array[j]= res2;

                        }
                    }
                }
            }
            System.out.println(array[i]);
        }


    }

    private static boolean isNumber(String a){
    try{
        int num = Integer.parseInt(a);
    }catch(NumberFormatException e){
        return false;

        }
        return true;
    }

    private static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0;
    }

}
