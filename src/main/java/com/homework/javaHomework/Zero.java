package com.homework.javaHomework;

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
        System.out.print("Введіть ділене: ");
        double a = input.nextDouble();
        System.out.print("Введіть дільник: ");
        double b = input.nextDouble();

        try{
            double result = divideNums(a,b);
            System.out.println(result);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
