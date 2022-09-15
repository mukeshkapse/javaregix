package com.bridgelab.regexemail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {

    static Pattern pattern = Pattern.compile("^[A-Z]{3,}");

    static Pattern pattern2 = Pattern.compile("^[A-Z]{3,}");
    static Pattern ForEmail = Pattern.compile(("^[a-z]{3,}[.]+[a-z]{3,}?[@]+[a-z]{2,}[.]+[a-z]{2,}[.]+[a-z]{2}$"));
    static  Pattern ForMobile = Pattern.compile("^[6-9]{1}[0-9]{1}[0-9]{10}");
    static Pattern ForPassword = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$).{8,}$");

    public static void emailValidate(String[] emails) {
        for(int i = 0; i< emails.length; i++ ){
            System.out.print(Pattern.matches("^[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", emails[i]) + " ");
        }
    }

    public static void main(String[] args) {



        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        Matcher matcher = pattern.matcher(Sc.nextLine());
        System.out.println("Enter Last Name");
        Matcher matcher1 = pattern2.matcher(Sc.nextLine());
       // System.out.println("Enter Email");
        //Matcher matcher3 = ForEmail.matcher(Sc.nextLine());
        System.out.println("Enter Mobile Number");
        Matcher matcher4 = ForMobile.matcher(Sc.nextLine());
        System.out.println("Enter Password");
        Matcher matcher5 = ForPassword.matcher((Sc.nextLine()));

        if(matcher.matches()&& matcher1.matches()){
            System.out.println("Valid");
        }
//        if(matcher3.matches()){
//            System.out.println("Valid Email");
//        }
        if(matcher4.matches()){
            System.out.println("Valid Mobile Number");
        }
        if(matcher5.matches()){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Detail");
        }
        String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

        System.out.println("Valid email :");
        emailValidate(validEmailSample);
        System.out.println("\nInvalid emails :");
        emailValidate(invalidEmailSample);
    }
    }
