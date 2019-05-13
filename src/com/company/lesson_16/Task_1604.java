package com.company.lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
и выведи оставшиеся элементы в обратном порядке.
*/

public class Task_1604 {
    public static void main(String[] args) throws IOException {
        resultList(getList(wordsList()));
    }
    private static List<String>wordsList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String>wordsList = new ArrayList<>();
        for(int i = 0; i<5;i++){
            wordsList.add(reader.readLine());
        }
        return wordsList;
    }
    private static List<String>getList(List<String>wordsList){
        for(int i = 0;i<wordsList.size();i++){
            if(i == 2){
                wordsList.remove(i);
            }
        }
        return wordsList;
    }
    private static void resultList(List<String>wordsList){
        for(int a = wordsList.size()-1;a>0;a--){
            System.out.println(wordsList.get(a));
        }
    }
}
