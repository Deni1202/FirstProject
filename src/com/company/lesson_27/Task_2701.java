package com.company.lesson_27;
/* Одинаковые слова в списке
Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_2701 {
    public static void main(String[]args){

    }
    private static List<String> allWords() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> words = new ArrayList<>();
        for(int i = 0 ;i<5;i++){
            words.add(reader.readLine());
        }
        return words;
    }
    private static void chekRepeet(List<String>words){
        Map<String,Integer> chekWords= new HashMap<>();
        Iterator<Map.Entry<String,Integer>> allWords =
    }
}
