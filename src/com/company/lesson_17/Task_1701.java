package com.company.lesson_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
public class Task_1701 {
    public static void main(String[] args){
    System.out.println(allString(stringOut()));
    }
    private static List<String>allString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String>allString=new ArrayList<>();
        String a = "";
        while(true){
            if(allString.equals(a)){
                break;
            }
            allString.add(0,reader.readLine());
        }
        return allString;
    }
    private static void stringOut(List<String>allString){
        List<String>newList = new ArrayList<>();
        for(int i = 0; i<allString.size();i++) {
            if (allString.size() % 2 == 0) {
              for(int a = 0;a<=1;a++){
                  newList.add(0,allString.get(i));
              }
            } if (allString.size() % 2 != 0) {
                for(int a = 0;a<=2;a++){
                    newList.add(0,allString.get(i));
                }

            }
        }
    }

}
