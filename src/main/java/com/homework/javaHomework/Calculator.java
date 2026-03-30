package com.homework.javaHomework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter a math example (ex. 23 + 4): ");
        Scanner input = new Scanner(System.in);
        String mathExample = input.nextLine().trim();
        String[] parts = mathExample.split(" ");
        double a = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double b = Double.parseDouble(parts[2]);


        switch(operator){
            case "+" -> printResult(a + b);
            case "-" -> printResult(a - b);
            case "*" -> printResult(a * b);
            case "/" -> {
                if (b != 0){
                    printResult(a / b);
                }else{
                    System.out.println("Zero can't be a divider");
                }
            }
            default -> System.out.println("We can't recognise your input");
        }


    }
    static void printResult(double result){
        if(result % 1 == 0){
            System.out.println("Answer is "+ (int)result);
        }else{
            System.out.println(("Answer is "+ result));
        }
    }
}
