package com.company.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
public class Task_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        int[] numb = new int[5];
        for(int i = 0; i<str.length;i++){
            str[i] = reader.readLine();
        }
        for(int a = 0;a<str.length;a++){
           numb[a] = str[a].length();
            System.out.println(numb[a]);
        }


    }
}


