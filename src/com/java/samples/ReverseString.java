package com.java.samples;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Learn Java!";
        char[] strChars = str.toCharArray();

        for(int x = strChars.length - 1; x >= 0; x--){
            System.out.print(strChars[x]);
        }
    }

}
