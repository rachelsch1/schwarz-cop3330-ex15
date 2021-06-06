package ex15.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // password is Qwerty$9
        System.out.print("What is the password? ");
        String inputPass = input.nextLine();

        if(inputPass.equals("Qwerty$9")) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
