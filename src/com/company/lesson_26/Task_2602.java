package com.company.lesson_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2602 {
    public static void main(String[]args) throws IOException {
    sort(allWords());
    }
    private static String[] allWords() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[]words = new String[10];
        for(int i = 0; i<words.length;i++){
            words[i] = reader.readLine();
        }
        return words;
    }
    private static void sort(String[]words){
        for(int i = 0; i<words.length-1;i++){
            for(int a = i;a<words.length-1;a++)
            if(words[a].compareTo(words[i]) >0){
                String k = words[a];
                words[a] = words[i];
                words[i] = k;
            }
            System.out.println(words[i]);
        }

    }
}
