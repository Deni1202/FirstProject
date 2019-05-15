package com.company.HomeWork.HW_06;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test_0603 {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ввести количество чисел: ");
      int N = Integer.parseInt(reader.readLine());
      System.out.println(getMinimum(getIntegerList(N)));
    }
    private static List<Integer> getIntegerList(int N) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа: ");
        List<Integer>integerList = new ArrayList<>();
        for(int i = 0; i<N;i++){
          integerList.add(0,Integer.parseInt(reader.readLine()));
        }
        return integerList;
    }
    private static int getMinimum(List<Integer>integerList){
        int min = integerList.get(0);
        for(int i = 0;i<integerList.size()-1;i++){
            if(min>integerList.get(i+1)){
                min = integerList.get(i+1);
            }
        }
        return min;
    }

}
