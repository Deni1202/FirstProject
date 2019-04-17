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
    public static void main(String[] args){
    arrayInitialisation(arrayDivision());
    }
    public static int[] arrayInitialisation() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 10;
        int[] arrayBig = new int[n];
        for(int i = 0; i<arrayBig.length;i++){
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }
        return arrayBig;
    }
    public static void arrayDivision(int[] arrayBig){
        int[] numbs1 = new int[arrayBig.length/2];
        int[] numbs2 = new int[arrayBig.length/2];
        for(int a = 0; a<numbs1.length;a++){
            numbs1[a] = arrayBig[a];
        }
        for(int b = numbs2.length;b<arrayBig.length;b++){
            numbs2[b] = arrayBig[b];
            System.out.println(numbs2[b]);
        }

    }
}
