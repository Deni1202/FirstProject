package com.company.lesson_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Task_1502 {
    public static void main(String[] args) throws IOException {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();
        while(true){
            if(strings.size()>5){
                break;
            }
            strings.add(0,reader.readLine());
        }

        for(int i = 0; i<13;i++){ // a b

            String one =  strings.remove(strings.size() -1);

            strings.add(0,one);
        }
        for(int a = 0; a < strings.size(); a++){
            System.out.println(strings.get(a));
        }
    }
}
