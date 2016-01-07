package com.company;

import java.util.Random;

/**
 * Created by Max on 07.01.2016.
 */
public class Randoms {
    public static void random(){
        Random r = new Random();
        int[] arr = new int[100];
        System.out.println("Random with transition: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("Random without transition: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
            System.out.print(arr[i] + "  ");
        }

    }
}
