package com.homework.javaHomework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter a math example (ex. 23 + 4): ");
        Scanner input = new Scanner(System.in);
        String mathExample = input.nextLine().trim();
        String prepared = mathExample.replaceAll("([+\\-*/])", " $1 ");
        String[] parts = prepared.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Неправильний формат");
            return;
        }
        try {
            double a = Double.parseDouble(parts[0]);
            String operator = parts[1];
            double b = Double.parseDouble(parts[2]);


            switch (operator) {
                case "+" -> printResult(a + b);
                case "-" -> printResult(a - b);
                case "*" -> printResult(a * b);
                case "/" -> {
                    if (b == 0) {
                        throw new ArithmeticException();
                    }
                    printResult(a / b);

                }
                default -> System.out.println("We can't recognise your input");
            }
        } catch (ArithmeticException ex) {
            System.out.println("На нуль ділити не можна");
        } catch (NumberFormatException ex) {
            System.out.println("Помилка. Ви ввели букви замість цифр.");
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

