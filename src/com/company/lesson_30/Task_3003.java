package com.company.lesson_30;

/*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User, что бы он возвращал следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/

public class Task_3003 {
    public static void main(String[] args) {


    }
}
interface DBObject{
    public void initializeIdAndName(long id, String name);
}
class User implements DBObject{

    private long id;
    private String name;
    @Override
    public void initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String res;
       System.out.printf(res ="User has name %s, id = %d");
       return res;
    }

}
class Matrix extends User implements DBObject{
    User user = new User();
    User user2 = new User();
}

