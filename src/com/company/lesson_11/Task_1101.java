package com.company.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 5 чисел.
2. Ввести с клавиатуры 5 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Task_1101 {
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] numb = new int[5];
    for(int i = 0;i<numb.length;i++){
        numb[i]= Integer.parseInt(reader.readLine());
    }
    for(int a = numb.length-1; a>=0;a--){
        System.out.println(numb[a]);
    }
}
}
