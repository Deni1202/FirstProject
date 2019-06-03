package com.company.lesson_20;

/*
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
Вывести результат на экран, каждый элемент с новой строки.
Вывести результат на экран в виде:
васька - ВАСЬКА
мурка - МУРКА
...
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_20Hw05 {
    public static void main(String[] args){
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        HashMap<String,Cat> allCats = new HashMap<>();
        for(int i = 0; i<cats.length;i++){
            allCats.put(cats[i],new Cat(cats[i]));
        }
        Iterator<Map.Entry<String,Cat>> Names = allCats.entrySet().iterator();
        while(Names.hasNext()){
            Map.Entry<String,Cat> result = Names.next();
            System.out.println(result.getKey() + " - " + result.getValue());
        }
    }
    private static class Cat{
       String name;
       public Cat(String name){
           this.name = name;

        }

        public String toString() {
            return name.toUpperCase();
        }
    }
}
