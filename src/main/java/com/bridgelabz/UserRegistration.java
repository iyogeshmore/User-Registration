package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public static void validateFirstName() {

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

    public static void validateEmail() {
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

    public static void validateMobileNumber() {
        System.out.println("Enter your mobile number: ");
        String mobileNo = sc.next();
        String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileNo);
        boolean r = matcher3.matches();

        if (r)
            System.out.println("It is a valid Mobile Number.");
        else
            System.out.println("It is invalid Mobile Number.");
    }

    public static void validatePasswordRule1() {
        System.out.println("Enter Your Unique Password :  ");
        String password = sc.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);
        boolean r = matcher4.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validatePasswordRule2() {
        System.out.println("Enter The Password At least Eight Character one Upper case: ");
        String password = sc.nextLine();
        String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password);
        boolean r = matcher5.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validatePasswordRule3() {
        System.out.println("Enter The Password At least one Upper case and one numeric");
        String password = sc.nextLine();
        String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password);
        boolean r = matcher6.matches();

        if (r)
            System.out.println("It is a vali" +
                    "d Password.");
        else
            System.out.println("It is invalid Password.");

    }

    public static void validatePasswordRule4() {
        System.out.println("Enter the Password At least One Upper Case & One Numeric & One Special Character:");
        String password = sc.nextLine();
        String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(password);
        boolean r = matcher7.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");
    }

    public static void emailSamples() {
        System.out.print("Enter the email :");
        String emailSample = sc.next();
        String regex8 = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(emailSample);
        boolean r = matcher8.matches();
        if (r)
            System.out.println("Valid G-mail Address");
        else
            System.out.println("Invalid G-mail Address");
    }

    //Junit UC1: Take First Name And Check It Is Getting Matched With Regex/Regular

//    public boolean validateFirstName(String fname) {
//        String regex = "^[A-Z]{1}[a-z]*";
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(fname);
//        boolean r = m.matches();
//        return r;
//    }

    //Exception Handled for First name : throw custom exceptions in case of Invalid User Details

    private static final String regex = "^[A-Z]{1}[a-z]*";

    public boolean validateFirstName(String fName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex);
        if (Pattern.matches(regex, fName) == true)
            return Pattern.matches(regex, fName);
        else {
            throw new UserRegistrationException("Send a proper First Name");
        }
    }

    //Junit UC2: Take Last Name And Check It Is Getting Matched With Regex/Regular

//    public boolean validateLastName(String lName) {
//        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
//        Pattern pattern1 = Pattern.compile(regex1);
//        Matcher matcher1 = pattern1.matcher(lName);
//        boolean r = matcher1.matches();
//        return r;
//    }

    //Exception Handled for Last name : throw custom exceptions in case of Invalid User Details

    private static final String regex1 = "^[A-Z]{1}[a-z]*";

    public boolean validateLastName(String lName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex1, lName) == true)
            return Pattern.matches(regex1, lName);
        else {
            throw new UserRegistrationException("Send a proper Last Name");
        }
    }

    //Junit UC3: Take Email And Check It Is Getting Matched With Regex/Regular

//        public boolean validateEmail (String email){
//            String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
//            // {1,}^[a-z]+[0-9]+[@]+gmail.com
//            Pattern pattern2 = Pattern.compile(regex2);
//            Matcher matcher2 = pattern2.matcher(email);
//            boolean r = matcher2.matches();
//            return r;
//        }

    //Exception Handled for Email : throw custom exceptions in case of Invalid User Details

    private static final String regex2 = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";

    public boolean validateEmail(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex2, email) == true)
            return Pattern.matches(regex2, email);
        else {
            throw new UserRegistrationException("Send a proper Email");
        }
    }

    //Junit UC4: Take Mobile Number And Check It Is Getting Matched With Regex/Regular

//        public boolean validateMobileNumber (String mobileNo){
//            String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";
//            Pattern pattern3 = Pattern.compile(regex3);
//            Matcher matcher3 = pattern3.matcher(mobileNo);
//            boolean r = matcher3.matches();
//            return r;
//        }

//Exception Handled for Mobile Number : throw custom exceptions in case of Invalid User Details

    private static final String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";

    public boolean validateMobileNumber(String mobileNo) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex3);
        if (Pattern.matches(regex3, mobileNo) == true)
            return Pattern.matches(regex3, mobileNo);
        else {
            throw new UserRegistrationException("Send a proper Mobile Number");
        }
    }

    //Junit UC5: Take Password (Minimum 8 characters) And Check It Is Getting Matched With Regex/Regular

//        public boolean validatePasswordRule1 (String password){
//            String regex4 = "^[A-Z a-z 0-9]{8,}$";
//            Pattern pattern4 = Pattern.compile(regex4);
//            Matcher matcher4 = pattern4.matcher(password);
//            boolean r = matcher4.matches();
//            return r;
//        }

    //Exception Handled for Password Rule 1 : throw custom exceptions in case of Invalid User Details

    private static final String regex4 = "^[A-Z a-z]{8,}$";

    public boolean validatePasswordRule1(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex4);
        if (Pattern.matches(regex4, password) == true)
            return Pattern.matches(regex4, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 1 " +
                    "(Minimum 8 characters)");
        }
    }

    //Junit UC6: Take Password (Password At least Eight Character one Upper case) And
    // Check It Is Getting Matched With Regex/Regular

//        public boolean validatePasswordRule2 (String password){
//            String regex5 = "^[A-Z]{1}+[a-z 0-9]{7,}$";
//            Pattern pattern5 = Pattern.compile(regex5);
//            Matcher matcher5 = pattern5.matcher(password);
//            boolean r = matcher5.matches();
//            return r;
//        }

    //Exception Handled for Password Rule 2 : throw custom exceptions in case of Invalid User Details

    private static final String regex5 = "^[A-Z]{1}+[a-z]{8,}$";

    public boolean validatePasswordRule2(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex5);
        if (Pattern.matches(regex5, password) == true)
            return Pattern.matches(regex5, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 2 " +
                    "(Password At least Eight Character one Upper case)");
        }
    }

    //Junit UC7: Take Password (Password At least one Upper case and one numeric) And
    // Check It Is Getting Matched With Regex/Regular

//        public boolean validatePasswordRule3 (String password){
//            String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
//            Pattern pattern6 = Pattern.compile(regex6);
//            Matcher matcher6 = pattern6.matcher(password);
//            boolean r = matcher6.matches();
//            return r;
//        }

    //Exception Handled for Password Rule 3 : throw custom exceptions in case of Invalid User Details

    private static final String regex6 = "^[A-Z]{1}+[a-z]{8,}$";

    public boolean validatePasswordRule3(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex6);
        if (Pattern.matches(regex6, password) == true)
            return Pattern.matches(regex6, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 3 " +
                    "(Password At least one Upper case and one numeric)");
        }
    }

    //Junit UC8: Take Password (Password At least One Upper Case & One Numeric & One Special Character) And
    // Check It Is Getting Matched With Regex/Regular

//        public boolean validatePasswordRule4 (String password){
//            String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
//            Pattern pattern7 = Pattern.compile(regex7);
//            Matcher matcher7 = pattern7.matcher(password);
//            boolean r = matcher7.matches();
//            return r;
//        }

    //Exception Handled for Password Rule 4 : throw custom exceptions in case of Invalid User Details

    private static final String regex7 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";

    public boolean validatePasswordRule4(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex7);
        if (Pattern.matches(regex7, password) == true)
            return Pattern.matches(regex7, password);
        else {
            throw new UserRegistrationException("Enter password according to rule 4 " +
                    "(Password At least One Upper Case & One Numeric & One Special Character)");
        }
    }

    //Junit UC9: Take Email And Check It Is Getting Matched With Regex/Regular
//
//        public boolean emailSamples (String emailSample){
//            String regex8 = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
//            Pattern pattern8 = Pattern.compile(regex8);
//            Matcher matcher8 = pattern8.matcher(emailSample);
//            boolean r = matcher8.matches();
//            return r;
//        }
    //Exception Handled for Email checking: throw custom exceptions in case of Invalid User Details

    private static final String regex8 = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";

    public boolean emailSamples(String emailSample) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex8);
        if (Pattern.matches(regex8, emailSample) == true)
            return Pattern.matches(regex8, emailSample);
        else {
            throw new UserRegistrationException("Invalid Email format");
        }
    }
}