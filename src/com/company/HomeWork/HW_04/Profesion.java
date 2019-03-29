package com.company.HomeWork.HW_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* программист.]
Пример текста:
Света программист. // 10 раз
…
*/

public class Profesion {
    public static void main(String[] args) throws IOException {
        out();
    }

    public static void out() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String whatYourName = reader.readLine();
        for(int a = 0;a<10;a++) {
            System.out.println(whatYourName + " програмист!");

        }
    }
}
