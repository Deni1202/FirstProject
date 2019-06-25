package com.company.lesson_28;

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
В классе Horse создать переменные name, flyable, runnable
Созать конструктор для всех переменных класса Horse
В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
- если переменная true, My name is + this.name + , i can fly =)
- если переменная false, My name is + this.name + , i cant fly =(
Унаследовать пегаса от лошади.
В методе main создать два объекта: horse и pegas
Подумать, какие значения присваивать переменным определенного класса.
*/

public class Task_2801 {
    public static void main(String[] args) {

    }
    class Horse{
        private String name;
        private boolean flyable;
        private boolean runnable;

        public Horse(String name, boolean flyable, boolean runnable){
            this.name = name;
            this.flyable = flyable;
            this.runnable = runnable;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public boolean getFlyble(){
            return flyable;
        }
        public void setFlyable(boolean flyable){
            this.name = name;
        }
    }

    }
    class Pegas extends Horse{
        public Horse(String name, boolean flyable, boolean runnable){
            super(name,flyable,runnable);
    }
}
