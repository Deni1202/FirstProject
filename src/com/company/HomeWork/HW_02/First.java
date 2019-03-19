package com.company.HomeWork.HW_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 14.03.2019.
 */
public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int number = Integer.parseInt(reader.readLine());
        int time = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + number + " через " + time + " лет.");

    }
}
