package com.homework.tasks;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Enter 3 triangle parameters: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean b1 = a + b > c && a + c > b && b + c > a;
        boolean b2 = a > 0 && b > 0 && c > 0;
        if (b1 && b2){
            System.out.println("Yes, baby, this is a triangle");
        }
        else{
            System.out.println("Noooo, this isn't a triangle");
        }
        in.close();
    }
}
