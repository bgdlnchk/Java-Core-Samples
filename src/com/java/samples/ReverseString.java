package com.java.samples;

/*
 String reversing example.
 Created 27.11.2020 by Bogdan Lonchuk
 */

public class ReverseString {
    public static void main(String[] args) {
        String str = "Learn Java!";
        char[] strChars = str.toCharArray();

        for(int x = strChars.length - 1; x >= 0; x--){
            System.out.print(strChars[x]);
        }
    }

}
