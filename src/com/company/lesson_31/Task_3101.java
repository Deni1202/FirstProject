package com.company.lesson_31;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Task_3101 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();

        InputStream input = new FileInputStream(s1);

            while(input.available() > 0) {
                int res = (char)input.read();
                System.out.println(res);
            }
        }
    }
