package com.company.lesson_31;

/*
1. Создать классы Person, RepkaStory и интерфейс RepkaItem
2. В интерфейсе RepkaItem создать метод String getNamePadezh();
3. Реализовать интерфейс RepkaItem в классе Person.
5. В классе Person создать переменные  String name, String namePadezh;
6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
7. Создать метод tell в классе RepkaStory.
8. С помощью цикла реализовать метод tell, который должен выполнять логику вывода на экран с помощью метода pull(Person person)
9. Выполнить метод main
 List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
*/

import java.util.ArrayList;
import java.util.List;

public class Task_3104 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);


    }
}
class Person implements RepkaItem{
    private String name;
    private String namePadezh;

    public Person(String name,String namePadezh){
        this.name = name;
        this.namePadezh = namePadezh;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNamePadezh(){
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }
    public void pull(Person person){
        System.out.println(getName() + " за " + getNamePadezh());
    }
}
class RepkaStory {
    public static void tell(List<Person>allPerson){
        for(int i = 0;i<allPerson.size();i++){
           System.out.println(allPerson.get(i).getName() + " за " + allPerson.get(i).getNamePadezh());
        }

    }

}
interface RepkaItem{
    String getNamePadezh();

}
