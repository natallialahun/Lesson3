package com.epam.lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natallia_Lahun on 02/10/2017.
 */
public class Task2 {
    /*В целочисленной последовательности есть нулевые элементы. Создать массив из
    номеров этих элементов.*/

    public static void main(String[] args) {
        int[] sequences = {1, 2, 0, 4, 5, 0, 7};
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < sequences.length; i++) {// всегда подзадачи лучше оформлять отдельными методами
            if (sequences[i] == 0) {
                result.add(i);
            }
        }
        for (int r:result) {
            System.out.println(r);
        }

    }
}
