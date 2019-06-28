package com.company.lesson_19;

/*
Задача: Ввести с клавиатуры 5 слов и выведи их в алфавитном порядке.
*/


import com.sun.xml.internal.bind.v2.TODO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1902 {
    public static void main(String[] args) throws IOException {
chekWords(allWords());

    }
    private static String[] allWords() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[5];
        for(int i = 0;i<words.length;i++){
         words[i] = reader.readLine();
        }
        return words;
    }
    private static void chekWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int a = 0; a < words.length-1; a++) {
                if (words[a].compareTo(words[a+1]) > 0) {
                    String n = words[a];
                    words[a] = words[a+1];
                    words[a+1] = n;
                }
            }
            System.out.println(words[i]);
        }
    }
}
