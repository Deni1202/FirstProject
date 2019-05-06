package com.company.lesson_15;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class Task_1501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();
        while (true) {
            strings.add(0, reader.readLine());
            if (strings.size() > 5) {
                break;
            }
        }
        String maxLength = strings.get(0);
        for (int i = 0; i < strings.size() - 1; i++) {
            if (maxLength.length() < strings.get(i + 1).length()) {
                maxLength = strings.get(i + 1);
            }

        }
        for (int a = 0; a < strings.size() - 1; a++) {
            if (maxLength.length() == strings.get(a).length()) {
                maxLength = strings.get(a);
                System.out.println(maxLength);
            }
        }
    }
}
