package com.company.lesson_24;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_2402 {
    public static void main(String[] args){
        readData();
    }
    private static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        List<Integer> numb = new ArrayList<>();
        try{
            if(numb.equals(s)){
        }catch(Exception e){
            for(int i =0; i<numb.size();i++){
            System.out.println(numb.get(i));
        }
        numb.add(Integer.parseInt(reader.readLine()));


    }
}
