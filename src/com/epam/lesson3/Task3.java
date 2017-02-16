package com.epam.lesson3;

import java.util.List;

/**
 * Created by Natallia_Lahun on 02/10/2017.
 */
public class Task3 {


    public static void main (String[] args) {
        Integer[] seq = {1,2,3,4,5,6};
        Integer[] seq2 = {1,2,3,4,-1,6};
        System.out.println("seq is positive: " + isPositive(seq));
        System.out.println("seq2 is positive: " + isPositive(seq2));

    }

    private static boolean isPositive(Integer[] seq) {
        int sv;
        sv = seq[0];

        for (int i = 1; i< seq.length; i++) {
            if (seq[i] <=  sv) {
                return false;
            }
            sv = seq[i];
        }
        return true;
    }
}
