package com.company.lesson_33;
/* Куриная фабрика
Написать Фабрику(Factory) по производству кур(Hen)
1. Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

2. Создать класс RussianHen, который наследуется от Hen
3. Создать класс UkrainiannHe, который наследуется от Hen
4. Создать класс MoldovanHen, который наследуется от Hen
5. Создать класс BelarusianHen, который наследуется от Hen

6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.

7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса>  + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

8. В выполняющем классе создать класс HenFactory и реализовать в нём метод getHen,
 который возвращает соответствующую стране породу кур.
 Список стран вынести в отдельный интерфейс Country.
9. Все созданные вами классы должны быть в отдельных файлах
*/

public class Task_3301 {
    public static void main(String[] args) {
        for (WhatIsACountry country:WhatIsACountry.values()) {
            switch (country){
                case RUSSIAN:
                    System.out.println("Россия");
                    break;
                case UKRAINE:
                    System.out.println("Украина");
                    break;
                case MOLDOVIAN:
                    System.out.println("Молдова");
                    break;
                case BELARUSIAN:
                    System.out.println("Беларусь");
                    break;
            }
        }
        Hen hen = new RussianHen(,10);
        Hen hen1 = new BelarusianHen("Беларусь",15);
        Hen hen2 = new MoldovanHen("Молдова",20);
        Hen hen3 = new UkrainiannHen("Украина",25);
    }
    enum WhatIsACountry{
        RUSSIAN,
        UKRAINE,
        BELARUSIAN,
        MOLDOVIAN;
    }
    class HenFactory{
        public String  getHen(String country){

        }
    }
}
abstract class Hen{
    private String country;
    private int egg;

    public Hen(String country, int egg){
        this.country = country;
        this.egg = egg;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
    abstract int getCountOfEggsPerMonth();
    String getDescription(){
        return "Я курица";
    }

}
class RussianHen extends Hen{
    private String country;
    private int egg;

    public RussianHen(String country, int egg){
        super(country,egg);
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
    int getCountOfEggsPerMonth() {
        return egg;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }
}
class MoldovanHen extends Hen{
    private String country;
    private int egg;

    public MoldovanHen(String country, int egg){
        super(country,egg);

    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
    int getCountOfEggsPerMonth() {
        return egg;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }

}
class BelarusianHen extends Hen{
    private String country;
    private int egg;

    public BelarusianHen(String country, int egg){
        super(country,egg);

    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
    int getCountOfEggsPerMonth() {
        return egg;
    }

    @Override
    String getDescription() {
       return super.getDescription() + " Моя страна " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }
}
class UkrainiannHen extends  Hen{
    private String country;
    private int egg;

    public UkrainiannHen(String country, int egg){
        super(country,egg);

    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
    int getCountOfEggsPerMonth() {
        return egg;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна " + getCountry() + ". Я несу " + getCountOfEggsPerMonth() + " в месяц.";
    }
}

