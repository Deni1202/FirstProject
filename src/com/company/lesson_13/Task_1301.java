package com.company.lesson_13;

/**
 * Missing number
 * You are given a array of n-1 integers and these integers are in the range of 0 to n.
 * There are no duplicates in array. One of the integers is missing in the array. Write an efficient code to find the missing integer.
 * Example:
 * I/P    [0, 1, 2, 4, ,6, 3, 7, 8]
 * O/P    5
 */
public class Task_1301 {
    public static void main(String[] args) {
        int[] arr = {5,4,7};
        System.out.println(retArr(arrayFinal(arr)));
    }

    private static int[] arrayFinal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }

            }
        }
        return arr;
    }

    private static int retArr(int[] array) {
        int[] arr2 = new int[array.length];
        int j = array[0];
        int f = 0;
        for (int a = 0; a < array.length; a++) {
            arr2[a] = j;
            j--;

            if (arr2[a] != array[a]) {
                f = arr2[a];
                return f;
            }

        }
        return f;
    }
}
