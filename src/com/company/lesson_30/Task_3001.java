package com.company.lesson_30;

/*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3001 {
    public static void main(String[] args) {
        AlcoholicBeer alcogol = new AlcoholicBeer();
        System.out.println(alcogol.toString());
    }
}
interface Drink{
    public boolean isAlcoholic() throws IOException;
}
class AlcoholicBeer implements Drink{
    @Override
    public boolean isAlcoholic() {
        return true;
    }
    public String toString(){
        String res;
        if(isAlcoholic()){
          res = "Напиток алкогольный";
        }else{
            res = "Напиток безалкогольный";
        }
        return res;

    }
}