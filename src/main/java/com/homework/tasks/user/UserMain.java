package com.homework.tasks.user;

public class UserMain {
    public static void main(String[] args) {
        User user = new Admin();
        User user2 = new Customer();

        if(user instanceof Admin){
            System.out.println("This is Admin");

        }else if(user instanceof Customer){
            System.out.println("This is Customer");
        }else{
            System.out.println("I have no idea who this is");
        }
    }
}
