package com.bridgelab.regexemail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
 static Pattern pattern = Pattern.compile("^[A-Z]{3,}");
    static Pattern pattern2 = Pattern.compile("^[A-Z]{3,}");
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        Matcher matcher = pattern.matcher(Sc.nextLine());
        System.out.println("Enter Last Name");
        Matcher matcher1 = pattern2.matcher(Sc.nextLine());

        if(matcher.matches()&& matcher1.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
