/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment20 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        double total = 0.0, tax = 0.0;

        System.out.println("What is order amount?: ");
        int amount = scan.nextInt();

        System.out.println("What state do you live in?: ");
        String state = scan.next();

        if(state.equals("Wisconsin")){

            System.out.println("What county do you live in?: ");
            String county = scan.next();

            if(county.equals("Eau Claire")){

                tax = (amount * 5.005)/100;
                total = tax + amount;

            }
            else if(county.equals("Dunn")){

                tax = (amount * 5.004)/100;
                total = tax + amount;

            }
            else{

                System.out.println("Please enter correct county");

            }
        }
        else if(state.equals("Illinois")){

            tax = (amount * 8)/100;
            total = tax + amount;

        }
        else{
            tax = 0.0;
            total = amount;
        }

        System.out.println("The tax is  $" + String.format("%.2f",tax));
        System.out.println("The total is  $" + String.format("%.2f",total));
    }
}