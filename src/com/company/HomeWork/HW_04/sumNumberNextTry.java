package com.company.HomeWork.HW_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/

public class sumNumberNextTry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int sum = 0;
            for (; a != -1;a = Integer.parseInt(reader.readLine()) ) {

                sum = sum + a;
                System.out.println(sum);
            }
        if (a == -1) {
            sum = sum + a;
            System.out.println(sum);
        }
    }

}
