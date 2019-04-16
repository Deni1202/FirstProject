package com.company.lesson_11;

/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1102 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = 20;
        int[] numbs = new int[q];
        int[] numb1 = new int[numbs[q/2]];
        int[] numb2 = new int[q/2];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = Integer.parseInt(reader.readLine());
        }
        for (int a = 0; a < numb1.length; a++) {
            numb1[a] = numbs[a];
        }
        for(int b =0;b<numbs.length;b++){
            numb2[b] = numbs[b+(numb2.length-1)];
            System.out.println(numb2[b]);
        }
        }
        }



