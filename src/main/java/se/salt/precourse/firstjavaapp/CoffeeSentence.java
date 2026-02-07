package se.salt.precourse.firstjavaapp;

import java.util.Scanner;

public class CoffeeSentence {

    public static void main (String[] args){
        //Create a program that asks user for a season for the year
        // then a whole number then an adjective. Use the input to complete
        //the sentence below: On a [adj][season] day, I drink a minimum of
        // [whole number] cups of coffee.

        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a "+ adjective + " "+ season + " day, I drink a minimum of "+ number +" cups of coffee.");

    }
}
