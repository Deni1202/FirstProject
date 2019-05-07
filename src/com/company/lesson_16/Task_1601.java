package com.company.lesson_16;

/* Три массива
1. Введи с клавиатуры 8 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_1601 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbOne =new ArrayList<>();
        List<Integer> numbTwo = new ArrayList<>();
        List<Integer> numbLast = new ArrayList<>();
        while (true) {
            numbers.add(0, Integer.parseInt(reader.readLine()));
            if (numbers.size() > 8) {
                break;
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                numbOne.add(0,numbers.get(i));
            }
            if(numbers.get(i) % 3 == 0){
                numbTwo.add(0,numbers.get(i));
            }if(numbers.get(i)%2 != 0 && numbers.get(i)%3 != 0){
                numbLast.add(0, numbers.get(i));
            }
        }
        printList(numbers);
        System.out.println(00000000000000000000000000000);
        printList(numbOne);
        System.out.println(00000000000000000000000000000);
        printList(numbTwo);
        System.out.println(00000000000000000000000000000);
        printList(numbLast);
    }
    private static  void printList(List<Integer>numberSelect){
    System.out.println(numberSelect);

    }
}
