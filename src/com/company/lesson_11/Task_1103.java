package com.company.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на n чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на n/2 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Task_1103 {
    public static void main(String[] args) throws IOException {
    arrayDivision(arrayInitialisation());
    }
    public static int[] arrayInitialisation() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayBig = new int[11];
        for(int i = 0; i<arrayBig.length;i++){
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }
        return arrayBig;
    }
    public static void arrayDivision(int[] arrayBig){
        int[] numbs1 = new int[arrayBig.length/2];
        int[] numbs2 = new int[arrayBig.length - numbs1.length];

        for(int i = 0;i<numbs1.length;i++){
            numbs1[i] = arrayBig[i];
        }
        for(int i = 0;i<numbs2.length;i++){
            numbs2[i] = arrayBig[i + numbs1.length];
            System.out.println(numbs2[i]);
        }
        }

    }
