package com.company.lesson_16;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
лира
лоза
роза

Выходные данные:
лира
лоза
лоза
*/

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_1602 {
    public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> allWords = new ArrayList<>();
    }
    private static List<String> listEnter(List<String>allWords){
        while(true){
            allWords.add(0, reader.readLine());
            if(allWords.size()>10){
                break;
            }
            return allWords;

        }
        return allWords;
    }
}
