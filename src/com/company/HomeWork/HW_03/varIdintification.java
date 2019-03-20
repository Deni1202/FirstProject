package com.company.HomeWork.HW_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class varIdintification {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(reader.readLine());
        var(a);
    }
    public static int var(int a) throws IOException {

        if(a>0){
            System.out.println(a * 2);
        }else if(a<=0){
            System.out.println(a + 1);
        }
        return a;
    }

}
