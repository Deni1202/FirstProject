package com.company.lesson_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by User on 14.03.2019.
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a numbers: ");
        String str = bufferedReader.readLine();
        int number = Integer.parseInt(str);
        int number2 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Text:" + str);
        System.out.println(number % 2);
        System.out.println(number * number2);
    }
}
