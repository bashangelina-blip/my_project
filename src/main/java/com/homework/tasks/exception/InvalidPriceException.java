package com.homework.tasks.exception;

public class InvalidPriceException extends RuntimeException{
   public InvalidPriceException(String message){
       super(message);
   }
}
