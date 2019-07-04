package com.company.lesson_30;

/*
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3005 {
    public static void main(String[]args) throws IOException {
//        Today dayNow = new Today();
//        System.out.format(dayNow.getWeatherType(),dayNow.toString());
    }
}

interface Weather{
    String getWeatherType() throws IOException;
}
interface WeatherType{
    String weatherType = "Sunshine";
    String weatherType2 = "It`s Rain";
    String weatherType3 = "It`s Frozen";

}
class Today implements Weather{
    private String type;

    public Today(String type){
        this.type = type;
    }

    @Override
    public String getWeatherType() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Какая погода за окном?");
        int ch = Integer.parseInt(reader.readLine());
        if(ch == 0) {
            type = WeatherType.weatherType;
        }if(ch == 1){
            type = WeatherType.weatherType2;
        }else{
            type = WeatherType.weatherType3;
        }
        return type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String toString(){
        String s="";
        System.out.format(s ="%s for today.", type);
        return s;
    }
}