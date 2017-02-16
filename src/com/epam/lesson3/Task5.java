package com.epam.lesson3;

import static com.epam.lesson3.Utils.printArray;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Task5 {
    /*Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
*/
    public static void main(String[] args) {
        printArray(getArray(10));
        System.out.println();
        printArray(getArray(5));
    }

    private static Integer[][] getArray (int n){
        Integer[][] arr = new Integer[n][n];
        for (int i=0; i < n; i++ ){
            if (i%2 == 0) {
                arr[i] = getOddArray(n);
            } else {
                arr[i] = getEvenArray(n);
            }

        }
        return arr;
    }

    private static Integer[] getEvenArray(int n) {
        Integer[] arr = new Integer[n];
        int val = n;
        for (int i = 0; i < n; i++) {
            arr[i] = val;
            val--;
        }
        return arr;
    }

    private static Integer[] getOddArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        return arr;
    }


}
