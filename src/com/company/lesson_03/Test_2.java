package com.company.lesson_03;

/**
 * ������� ����� convert, ������� ������ �������������� ������ � �������.
 * � ����� ������ ��������� ���� �������� (�-�� ������). ����� ������ ���������� �-�� ��������.
 */
public class Test_2 {
    public static void main(String[] args){
        System.out.println(convert(3000));

    }
    public static double convert(double gr){
        double kurs = 28;
        double dol = (gr / kurs);
        return dol;
    }
}
