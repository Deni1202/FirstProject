package com.company.lesson_17;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_1703 {
    public static void main(String[] args) throws IOException {
    stringOut(allString());
    }
    private static List<String> allString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String>allString = new ArrayList<>();

    while(true){
        String s = reader.readLine();
        if(s.equals("end")){
            break;
        }
        allString.add(0,s);
    }
    return allString;
    }
    private static void stringOut(List<String>allString){
        for(int i = 0; i<allString.size();i++){
            System.out.println(allString.get(i));
        }
    }
}
