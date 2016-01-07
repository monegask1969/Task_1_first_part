package com.company;

import java.util.Scanner;

/**
 * Created by Max on 07.01.2016.
 */
public class Welcome {
    public static void welcome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter You name, please: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " !");
    }
}
