package com.epam.lesson3;

import static com.epam.lesson3.Utils.*;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Task6 {
    /*
    * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/
    public static void main(String[] args) {
        printArray(getArray(10));
        System.out.println();
        printArray(getArray(5));
    }

    private static Integer[][] getArray (int n){
        Integer[][] arr = new Integer[n][n];
        for (int i=0; i < n; i++ ){
            if (i == 0 || i == n-1) {
                arr[i] = getFistLastArray(n);
            } else {
                arr[i] = getMiddleArray(n);
            }

        }
        return arr;
    }

    private static Integer[] getFistLastArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    private static Integer[] getMiddleArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            if (i ==0 || i == n-1) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
