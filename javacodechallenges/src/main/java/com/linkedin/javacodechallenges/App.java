package com.linkedin.javacodechallenges;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static void main( String[] args )
    {
        //if number is even, function returns "True"
        //if number is odd, function returns "False"
        //The input must be an integer

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Is the number even?: " + isEven(number));
        input.close();
    
    }
}

