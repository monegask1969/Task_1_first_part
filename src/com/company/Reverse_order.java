package com.company;

import java.util.Scanner;

/**
 * Created by Max on 07.01.2016.
 */
public class Reverse_order {
    public static void reverse_order(){
        System.out.println("Enter 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i=0; i<10; i++){
            arr1[i] = scanner.nextInt();

        }
        System.out.println("Here is Your array: ");
        for (int j=9; j>=0; j--){
            System.out.println(arr1[j]);
        }
    }
}
