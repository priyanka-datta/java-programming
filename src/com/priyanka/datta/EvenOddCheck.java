package com.priyanka.datta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddCheck {

    public static void main(String[] args) throws IOException {
        BufferedReader ad = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter one number");
        int number = Integer.parseInt(ad.readLine());
        if (number%2==0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
}
