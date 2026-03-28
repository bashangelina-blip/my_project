package com.homework.javaHomework;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] list = {4,5,9,13,15,20,19};

        System.out.println("Please enter the number to find if it's in the list:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = -1;

        for(int i = 0; i < list.length; i++){
            if (list[i]==n){
                index = i;
                break;
            }
        }
        if(index >= 0){
            System.out.println(n+ " at index "+ (index+1));
        }else{
            System.out.println(index);
        }

    }


}
