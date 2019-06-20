package com.company.lesson_27;

/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/

import java.io.*;

public class Task_2702 {
    public static void main(String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = null;
        InputStream input;
        while(true){
        try {
            first = reader.readLine();
            input = new FileInputStream(first);
            break;
        }catch(FileNotFoundException f){
            System.out.println("Фаил не существует");
        }

        }
        String second = reader.readLine();
        OutputStream outPut = new FileOutputStream(second);

        int a = 0;
        while(input.available()>0){
            int b = input.read();
            outPut.write(b);
            a++;
        }
        System.out.println(a);

    }

}
