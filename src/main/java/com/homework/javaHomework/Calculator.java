package com.homework.javaHomework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a math example (ex. 23 + 4): ");
                String line = input.nextLine();
                String[] parts = splitLine(line);

                double a = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double b = Double.parseDouble(parts[2]);

                printResult(calculate(a, operator, b));
                break;
            } catch (ArithmeticException ex) {
                System.out.println("На нуль ділити не можна");
            } catch (NumberFormatException ex) {
                System.out.println("Помилка. Ви ввели букви замість цифр.");
            } catch (IllegalArgumentException ex){
                System.out.println("Помилка. Невірний формат");
            }
        }
    }

     static String[] splitLine(String input) {
         String mathExample = input.trim();
         String prepared = mathExample.replaceAll("([+\\-*/])", " $1 ");
         String[] parts = prepared.split("\\s+");
         if (parts.length != 3) {
            throw new IllegalArgumentException("Неправильний формат");
         }
         return parts;
     }

    public static double calculate(double a, String operator, double b) throws ArithmeticException {
        return switch (operator) {
            case "+" -> (a + b);
            case "-" -> (a - b);
            case "*" -> (a * b);
            case "/" -> {
                if (b == 0) {
                    throw new ArithmeticException();}
                    yield a / b;
                }
            default -> throw new IllegalArgumentException("Unknown operator");
        };
    }



    static void printResult(double result){
        if(result % 1 == 0){
            System.out.println("Answer is "+ (int)result);
        }else{
            System.out.println(("Answer is "+ result));
        }
    }
}

