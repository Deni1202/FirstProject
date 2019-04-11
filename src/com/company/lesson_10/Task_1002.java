package com.company.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Task_1002 {
    public static void main(String[] args) throws IOException {
        printArray(nitializeArray());
    }

    public static String[] nitializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        for (int i = 0; i < str.length - 2; i++) {
            str[i] = reader.readLine();

        }
        return str;
    }
        public static void printArray(String[]array){
            for (int i = array.length-1; i>=0; i--) {
                System.out.println(array[i]);
            }

        }

}

