package com.company.lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Удвой слова
1. Введи с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.

Пример:
краб
лось
рак

Выходные данные:
краб краб
лось лось
рак рак
*/
public class Task_1603 {
    public static void main(String[] args) throws IOException {

      outString(reEnterList(enterWords()));
    }
    private static List<String> enterWords() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> manyWords = new ArrayList<>();
        for(int i = 0;i<5;i++){
            manyWords.add(0,reader.readLine());

        }
        return manyWords;
    }
    private static List<String>reEnterList(List<String>manyWords){
        List<String>lastList = new ArrayList<>();
       for(int a = 0;a<manyWords.size();a++){
               lastList.add(0,manyWords.get(a));
               lastList.add(0,manyWords.get(a));
       }
       return lastList;
    }
    private static void outString(List<String>lastList){
        for(int c =0;c<lastList.size()-1;c++){
            if(lastList.get(c).equals(lastList.get(c+1))){
                System.out.println(lastList.get(c) + " " + lastList.get(c+1));
            }
        }

    }
}
