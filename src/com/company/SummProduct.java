package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Max on 07.01.2016.
 */
public class SummProduct {
    public static void summproduct(){
        int n=10;
        int sum=0;
        int prod = 1;
        int[] array = new int[n];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            sum = sum + array[i];
            prod = prod * array[i];
        }
        System.out.println("Here is summ: " + sum);
        System.out.println("Here is prod: " + prod);
    }
}
