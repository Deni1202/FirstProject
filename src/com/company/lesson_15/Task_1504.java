package com.company.lesson_15;

/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_1504 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> allString = new ArrayList<>();

        while(true){
            allString.add(allString.size(), reader.readLine());
            if(allString.size()>10){
                break;
            }
        }
        for(int i = 0;i<allString.size();i++){
            System.out.println(allString.get(i));

        }
    }
}
