package com.bridgelab.regexemail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
 static Pattern pattern = Pattern.compile("^[A-Z]{3,}");

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter text:");
        Matcher matcher = pattern.matcher(Sc.nextLine());

        if(matcher.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
