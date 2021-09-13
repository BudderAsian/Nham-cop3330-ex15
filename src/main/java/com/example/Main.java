package com.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String storedPassword = "abc$123";
        String userEnteredPassword;
        Scanner scannerUserInput= new Scanner(System.in);

        System.out.print("What is the password? ");
        userEnteredPassword = scannerUserInput.nextLine();

        if(userEnteredPassword.compareTo(storedPassword) == 0)
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you!");

        scannerUserInput.close();
    }

}

