package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Task_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String money = reader.readLine();
        int n = Integer.parseInt(money);

        System.out.println(" Я буду зарабативать $ " + n + " в час!!!");


    }
}
