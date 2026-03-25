package com.homework.tasks;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);

        while(true){
            System.out.println("Enter a 5-digit palindrome:");
            String input = str.nextLine();
            if(input.length() != 5){
                System.out.println("You entered not a 5-digit number");
                continue;
            }
            if(!input.matches("\\d{5}")) {
                System.out.println("Mistake! Enter only number");
                continue;
            }
            if (input.charAt(0) == input.charAt(4) && input.charAt(1) == input.charAt(3)){
                System.out.println("This is a palindrome!");
            }else{
                System.out.println("This is not a palindrome");
            }
            break;
        }
    }
}
