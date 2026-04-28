package com.homework.tasks;

public class Divider {

    public static void divideNums(double a, double b){
        try{
            double c = a/b;
            if (b==0){
                throw new ArithmeticException("На нуль ділити не можна");
            }else{
                System.out.println(c);
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Операція завершена");
        }
    }


}
