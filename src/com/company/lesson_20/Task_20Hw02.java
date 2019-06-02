package com.company.lesson_20;
/*
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 5 строк: арбуз, банан, вишня, груша, .
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task_20Hw02 {
    public static void main(String[] args){
        setChange(allNames());

    }
    private static Set<String>allNames(){
        Set<String> allNames =new HashSet<>();
        allNames.add("арбуз");
        allNames.add("банан");
        allNames.add("вишня");
        allNames.add("груша");
        allNames.add("дыня");

        return allNames;
    }
    private static void setChange(Set<String>allNames){
        Iterator<String> names = allNames.iterator();
        while(names.hasNext()){
            String name = names.next();
            System.out.println(name);
        }

    }
}
