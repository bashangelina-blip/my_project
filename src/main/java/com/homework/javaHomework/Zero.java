package com.homework.javaHomework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zero {
    public static double divideNums(double a, double b) throws ArithmeticException{
      if (b == 0){
          throw new ArithmeticException("На нуль ділити не можна");
      }
      return a / b;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Введіть ділене: ");
                double a = input.nextDouble();
                System.out.print("Введіть дільник: ");
                double b = input.nextDouble();
                double result = divideNums(a,b);
                System.out.println(result);
                break;
            }catch(ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }catch (InputMismatchException ex){
                System.out.println("Невідомий символ. Введіть число");
                input.nextLine();
            }
        }
    }
}
