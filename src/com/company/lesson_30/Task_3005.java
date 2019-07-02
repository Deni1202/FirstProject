package com.company.lesson_30;

/*
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/

public class Task_3005 {
    public static void main(String[]args){
        Today dayNow = new Today();
        System.out.println(dayNow.getWeatherType());
    }
}

interface Weather{
    String getWeatherType();
}
interface WeatherType{
    String weatherType = "Sunshine";
    String weatherType2 = "Rain";
    String weatherType3 = "Frozen";



}
class Today implements Weather{
    private String type;

    @Override
    public String getWeatherType() {
        String type = WeatherType.weatherType;
        return type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    String toString(String type){
        String myWeather;
        System.out.format(myWeather = "%s for today" + type);
        return myWeather;
    }
}