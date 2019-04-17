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
        int[] numbs = new int[10];
        int[] numb1 = new int[numbs[5]];
        int[] numb2 = new int[5];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = Integer.parseInt(reader.readLine());
        }
        for (int a = 0; a < numb1.length; a++) {
            numb1[a] = numbs[a];
        }
        for(int a =0;a<numb2.length;a++){
            numb2[a] = numbs[a+numb1.length];
            System.out.println(numb2[a]);
        }
        }
        }



