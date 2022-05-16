package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void validateFirstName(){

        System.out.println("Enter first name: ");
        String fName = sc.next();
        String regex = "^[A-Z]{1}[a-z]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);
        boolean r = matcher.matches();

        if (r)
            System.out.println("It is a valid first name.");
        else
            System.out.println("It is invalid first name.");
    }
    public static void validateLastName() {

        System.out.println("Enter last name: ");
        String lName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lName);
        boolean r = matcher1.matches();

        if (r)
            System.out.println("It is a valid last name.");
        else
            System.out.println("It is invalid last name.");
    }
    public static void validateEmail(){
        System.out.println("Enter your E-mail: ");
        String email = sc.next();
        String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
        // {1,}^[a-z]+[0-9]+[@]+gmail.com
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(email);
        boolean r = matcher2.matches();

        if (r)
            System.out.println("It is a valid E-mail.");
        else
            System.out.println("It is invalid E-mail.");
    }
}
