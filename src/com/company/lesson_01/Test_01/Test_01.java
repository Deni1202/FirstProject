package com.company.lesson_01.Test_01;

/*
1) ������� ��� ���������� (number1, number2, number3) ���� int, ��������� �� �������� 10, 18, 21 ��������������.
2) �� ��������� �����, ������� ���, ����� �������� � ���������� number1 ���������� �� 18
2) �� ��������� �����, ������� ���, ����� �������� � ���������� number2 ���������� �� 21
2) �� ��������� �����, ������� ���, ����� �������� � ���������� number3 ���������� �� 10
3) ������� �������� ������ ���������� � �������, ������ �������� �������� � ����� ������.
*/
public class Test_01 {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int number4 = number1;
        number1 = number2;
        number2 = number3;
        number3 = number4;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);



    }
}
