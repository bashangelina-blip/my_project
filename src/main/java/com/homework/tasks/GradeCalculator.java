package com.homework.tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int[] result = countSum();
        int sum = result[0];
        int count = result[1];
        if (count != 0){
            double averageNumber = (double) sum / count;
            System.out.println("Sum: " + sum);
            System.out.printf("Average: %.2f%n", averageNumber);
        }else{
            System.out.println("No numbers were entered");
        }
    }

    static int[] countSum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers (negative to quit): ");

        int sum = 0;
        int count = 0;
        while (true) {
            int number = in.nextInt();
            if (number < 0) break;
            sum = sum + number;
            count++;
        }

        return new int[]{sum, count};
    }
}

