package com.company.lesson_30;

/* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/

import static sun.misc.Version.print;

public class Task_3002 {
    public static void main(String[]args){
        Cola cola = new Cola();
        Beer beer= new Beer();
        print(cola.isAlcoholic());

    }
    private static String print(){
        String res;
        if(){
            System.out.println(res = "Напиток алкогольный");
        }else{
            System.out.println(res = "Напиток безалкогольный");
        }
        return res;
    }

}
interface Drink2{
    public boolean isAlcoholic();
}
class Cola implements Drink2{
    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
class Beer implements Drink2{
    @Override
    public boolean isAlcoholic() {
        return true;
    }

}
