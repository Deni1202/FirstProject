package com.company.lesson_30;

/*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
5. Создать класс GermanyTranslator, который наследуется от абстрактного класса Translator.
6. Реализовать все абстрактные методы.
7. Подумай, что должен возвращать метод getLanguage.
8. Программа должна выводить на экран "Я переводчик с немецкого".
*/

public class Task_3004 {
    public static void main(String[] args) {
        EnglishTranslator translator = new EnglishTranslator();
        GermanyTranslator translator2 = new GermanyTranslator();
        System.out.println(translator.translate());
        System.out.println(translator2.translate());
    }
}
abstract class Translator{
    abstract String getLanguage();
    public String translate(){
        String s = "Я переводчик c " + getLanguage();
        return s;
    }
}
class EnglishTranslator extends Translator{
    @Override
    String getLanguage() {
        String l = "английского!";
        return l;
    }

    @Override
    public String translate() {
        String res = super.translate();
        return res;
    }
}
class  GermanyTranslator extends Translator{
    @Override
    String getLanguage() {
        String l = "немецкого!";
        return l;
    }

    @Override
    public String translate() {
        String res = super.translate();
        return res;
    }

}
