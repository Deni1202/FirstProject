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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_1602 {
    public static void main(String[] args) throws IOException {
        System.out.println(fix(listEnter()));

    }

    private static List<String> listEnter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> allWords = new ArrayList<>();
        while (true) {
            if (allWords.size() >= 5) {
                break;
            }
            allWords.add(0, reader.readLine());
        }
        return allWords;
    }

   private static List<String>fix(List<String> allWords) {
        List<String>stringList = new ArrayList<>();
        for (int i = 0; i < allWords.size()-1; i++) {
            if (allWords.get(i).contains("л") && allWords.get(i).contains("р")) {
                stringList.add(0, allWords.get(i));
            }
            if (allWords.get(i).contains("р")) {
                allWords.remove(allWords.get(i));
            }
            if (allWords.get(i).contains("л")) {
                stringList.add(allWords.get(i));
                stringList.add(allWords.get(i));


            }

        }
        return stringList;
    }
}
