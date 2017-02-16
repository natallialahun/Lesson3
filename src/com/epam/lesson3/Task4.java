package com.epam.lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natallia_Lahun on 02/16/2017.
 */
public class Task4 {
    /*Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
четных чисел этой последовательности. Если таких чисел нет, то вывести
сообщение об этом факте.
    * */
    public static void main(String[] args) {
        Integer[] seq = {1,2,3,4,5,6};
        Integer[] seq2 = {1,3,5,7};

        printResult(getEvenSequence(seq));
        printResult(getEvenSequence(seq2));


    }

    private static List<Integer> getEvenSequence(Integer[] seq){
        List<Integer> result =   new ArrayList<Integer>();
        for (int num: seq) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    private static void printResult(List<Integer> result){
        if (result.size()>0) {
            for (int num: result) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        } else {
            System.out.println("There are not suitable numbers in sequence");
        }
    }


}
