package com.bridgelabz;

import java.util.Scanner;

public class UserRegisterationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registeration");
        Scanner input = new Scanner(System.in);
        int choice;
        do{

            System.out.println("Enter your choice: ");
            System.out.println("1: Validate name.");
            System.out.println("2: Validate last name.");
            System.out.println("3: Validate E-Mail.");
            System.out.println("0: Exit.");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    UserRegistration.validateFirstName();
                    break;
                case 2:
                    UserRegistration.validateLastName();
                    break;
                case 3:
                    UserRegistration.validateEmail();
                    break;
                default:
                    System.out.println("Enter valid input.");
            }
        }while (choice != 0);
    }
    }