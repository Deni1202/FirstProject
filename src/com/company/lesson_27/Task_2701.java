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
    public static void main(String[] args) throws IOException {
        Map<String, Integer> result = chekRepeet(allWords());
        System.out.println(result);

    }

    private static List<String> allWords() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(reader.readLine());
        }
        return words;
    }

    private static Map<String, Integer> chekRepeet(List<String> words) {
        Map<String, Integer> chekWords = new HashMap<>();
        for (int i = 0; i < words.size() - 1; i++) {
            chekWords.put(words.get(i),0);
            }

        Iterator<Map.Entry<String, Integer>> allWords = chekWords.entrySet().iterator();
        while (allWords.hasNext()) {
            Map.Entry<String, Integer> result = allWords.next();
            for (int a = 0; a < words.size(); a++) {
                if (result.getKey().equals(words.get(a))) {
                    int count = 1;
                    count++;
                    chekWords.put(words.get(a), count);
                }
            }

        }

            return chekWords;
        }

    }

