package com.company.lesson_18;
/*
// Задача по алгоритмам.
// Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
// Пример ввода:
// {123456789, 65475264, 836133896, 836133896, 746254373, 1000000000,
//  542627588, 1000000000, 444088605, 65475264, 746254373, 542627588, 444088605}
// Пример вывода:
// 123456789
*//*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Task_1801 {
    public static void main(String[] args) throws IOException {
System.out.println(findNotDouble(sort(allNumbers())));
    }
    private static int[] allNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] allNumbers = new int[9];
        for(int i = 0; i<allNumbers.length;i++){
            allNumbers[i] = Integer.parseInt(reader.readLine());
        }
        return allNumbers;
    }
    private static int[] sort(int[]allNumbers){
        int s = allNumbers[0];
      for(int a = 0; a<allNumbers.length;a++){
          for(int c = 0; c<allNumbers.length-1-a;c++){
          if(s<=allNumbers[c+1]){
              s=allNumbers[c];
              allNumbers[c] = allNumbers[c+1];
              allNumbers[c+1] = s;
          }
          }
      }
      return allNumbers;
    }
      private static int findNotDouble(int[]allNumbers) {
          int notDouble = 0;
          for (int b = 0; b < allNumbers.length - 1; b++) {

          }
      }
}
*/