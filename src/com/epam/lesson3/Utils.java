package com.epam.lesson3;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Utils {

    public static void printArray(Integer[][] resArray){
        for (Integer[] arr: resArray) {
            for (int i: arr) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
