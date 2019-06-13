package com.company.lesson_24;

import java.io.*;

public class Task_2403 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sFileName = reader.readLine();
        String tFileName = reader.readLine();

        InputStream inputStream = new FileInputStream(sFileName);//читаем фаил(копируем)
        OutputStream outPutStream = new FileOutputStream(tFileName);//записываем фаил

                while(inputStream.available()> 0){//проверяем наличие не прочитаной информации
                    int n = inputStream.read();
                    outPutStream.write(n);
                }

                inputStream.close();// закрываем потоки
                outPutStream.close();
    }
}
