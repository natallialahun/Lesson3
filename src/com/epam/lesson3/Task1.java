package com.epam.lesson3;

import java.util.Random;

public class Task1 {
        /*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
кратны данному К*/

    public static void main(String[] args) {
	// write your code here
        double[] arr = generateArray(50);
        double k = 1, sum = 0.0;
        for (double a: arr) {
            if (a % k == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }

    private static double[] generateArray(int num) {
        double[] arr = new double[num];
        Random rand = new Random();
        for (int i=0; i<num; i++) {
            arr[i]=rand.nextDouble();
        }
        return arr;
    }
}
