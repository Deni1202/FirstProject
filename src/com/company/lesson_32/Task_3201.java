package com.company.lesson_32;

/* Битва роботов
1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable и абстрактный класс AbstractRobot
2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 Сделать объекты неизменяемыми.
3. В интерфейсе Attackable создать метод BodyPart attack();
4. В интерфейсе Defensable создать метод BodyPart defense();
5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable
6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/

public class Task_3201 {
}

abstract class AbstractRobot implements Attackable, Defensable {
    private String name;
    private static int hitCount;

    public AbstractRobot(String name, int hitCount) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHitCount() {
        return hitCount;
    }

    public static void setHitCount(int hitCount) {
        AbstractRobot.hitCount = hitCount;
    }



    @Override
    public BodyPart attack() {
        hitCount = (int)(Math.random()*4)+1;
        if(hitCount == 1){
            return BodyPart.HAND;
        }else if(hitCount == 2) {
            return BodyPart.BODY;
        }else if(hitCount == 3){
            return BodyPart.HEAD;
        }else{
            return BodyPart.LEG;
        }
    }

    @Override
    public BodyPart defense() {
        hitCount = (int)(Math.random()*4)+1;
        if(hitCount == 1){
            return BodyPart.HAND;
        }else if(hitCount == 2) {
            return BodyPart.BODY;
        }else if(hitCount == 3){
            return BodyPart.HEAD;
        }else{
            return BodyPart.LEG;
        }
    }
}

class Robot extends AbstractRobot {
    public Robot(String name, int hitCount){
        super(name, hitCount);
    }

}

class BodyPart {
    private String bodyPart;

    public BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public final static BodyPart HAND = new BodyPart("Hand");
    public final static BodyPart HEAD = new BodyPart("Head");
    public final static BodyPart LEG = new BodyPart("Leg");
    public final static BodyPart BODY = new BodyPart("Body");

    @Override
    public String toString() {
        return this.bodyPart;
    }
}

interface Attackable {
    BodyPart attack();

}

interface Defensable {
    BodyPart defense();

}
