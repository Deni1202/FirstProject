package com.company.lesson_22;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
//TODO:23.06.2019
import org.omg.CORBA.Object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
public class Task_2204 {
    public static void main(String[] args){


    }
    static class Cat{
        private String name;

        public Cat(String name){
            this.name = name;
        }
        private String getName(){
            return name;
        }
        private void setName(String name){
            this.name = name;
        }
        public String toString(){
            String cats = " ";
            return  cats += "name= " + getName();
        }
    }
    static class Dog{
        private String name;

        public Dog(String name){
            this.name = name;
        }
        private String getName(){
            return name;
        }
        private void setName(String name){
            this.name = name;
        }
        public String toString(){
            String dogs = " ";
                return  dogs += "name= " + getName();
        }
    }

    private static Set<Cat> createCats() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Cat> allCats = new HashSet<>();
        System.out.println("Создать котов: ");
        for (int i = 0; i < 4; i++) {
            allCats.add(new Cat(reader.readLine()));

        }
        return allCats;
    }

    private static Set<Dog>createDogs() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Dog> allDog = new HashSet<>();
        System.out.println("Создать собак: ");
        for (int i = 0; i < 3; i++) {
            allDog.add(new Dog(reader.readLine()));
        }
        return allDog;
    }


    private static Set<Object>join(Set<Dog>allDogs, Set<Cat> allCats){
    Set<Object>allPets = new HashSet<>();
    allPets.add(allDogs);
    allPets.add(allCats);
    return allPets;
    }
    private static void removeCats(Set<Object>allPets,Set<Cat>allCats) throws IOException {
        Iterator<Object> iterator = allPets.iterator();
        while(iterator.hasNext()){
            if(allPets.contains(createCats())){
                allPets.remove(createCats());
            }
        }
    }
   private static void result(Set<Object>allPets){
        Iterator<Object>result = allPets.iterator();
        while(result.hasNext()){
            Object pets = result.next();
            System.out.println(pets);
        }
    }


}    */