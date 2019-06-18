package com.company.lesson_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_2601 {
    public static void main(String[]args) throws IOException {

        sort(allNumbers());
    }
    private static int[] allNumbers() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numb = new int[5];
        for(int i = 0; i < numb.length; i++) {
            numb[i] = (Integer.parseInt(reader.readLine()));

        }
        return numb;
    }
    private static void sort(int[] numb){
        for(int i = 0;i<numb.length;i++){
            for(int a = 0; a<numb.length-1; a++){
                int c = 0;
                if(numb[a]<numb[a+1]){
                    c = numb[a];
                    numb[a]=numb[a+1];
                    numb[a+1] = c;
                }

            }
            System.out.println(numb[i]);
        }

    }
}
