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
        myList();
    }
    private static List<String> myList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> allItem = new ArrayList<>();
        for(int i = 0; i<8;i++) {
            allItem.add(reader.readLine());
        }
        return allItem;

    }
    private static void sort(List<String>allItem){

        for(int i = 0; i<allItem.size();i++){
            for(int a = i;a<allItem.size()-1;a++){
                if(allItem.get(a).compareTo(allItem.get(i)>0))
            }
        }
    }

}
