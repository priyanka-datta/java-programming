package com.priyanka.datta;

import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            int number1 = scanner.nextInt();
            System.out.println("Enter second number");
            int number2 = scanner.nextInt();
            Double result = (double) Math.abs(number1 / number2);
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("In the finally block");
        }
    }
}
