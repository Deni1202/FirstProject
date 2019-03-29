package com.company.lesson_05;

/*
Вывести на экран квадрат 10х10 из букв S используя цикл while.
Буквы в одной строке не разделять.
*/
public class Test_06 {
    public static void main(String[] args){
        int a = 10;
        while(a>0){
            int c = 0;
            while(c<9){
                System.out.print("S ");
                c++;
            }
            System.out.println("S");
            a--;
        }
    }
}
