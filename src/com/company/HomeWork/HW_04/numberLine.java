package com.company.HomeWork.HW_04;

/*
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
8888888888
8
8
8
8
8
8
8
8
8
8
*/
public class numberLine {
    public static void main(String[] args){
    line();
    }
    public static void line(){
        for(int a = 1; a<10;a++){
            System.out.print(8);
        }
            for(int b = 0;b<=10;b++){
                System.out.println(8);
        }
    }
}
