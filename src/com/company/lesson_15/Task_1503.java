package com.company.lesson_15;
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_1503 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> allString = new ArrayList<>();

        while(true){
            allString.add(0,reader.readLine());
            if(allString.size()>5){
                break;
            }
        }
        String minString = allString.get(0);
        for(int i = 0; i<allString.size()-1;i++){
            if(minString.length()>allString.get(i+1).length()){
                minString = allString.get(i+1);
            }
        }
        System.out.println(minString);

        for(int a = 0;a<allString.size();a++){
            if(minString.length()==allString.get(a).length()){
                minString = allString.get(a);
                System.out.println(minString);
            }
        }
    }
}
