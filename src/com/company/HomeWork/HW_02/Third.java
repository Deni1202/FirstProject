package com.company.HomeWork.HW_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 14.03.2019.
 */
public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(a<b && b<c){
            System.out.println(b);
        }else if (a<c && c<b){
            System.out.println(c);
        }else if(c<a && a<b){
            System.out.println(a);
        }else if(c<b && b<a){
            System.out.println(b);
        }

    }
}
