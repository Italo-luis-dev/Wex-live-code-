package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "italo";
        reverseString(str);
        checkIfPalindrome(str);
    }

    public static String reverseString(String str) {
        String empty = "";
        if(str == null)
            return null;

        int tamanho = str.length();
        char[] builder = str.toCharArray();
        int j = tamanho-1;
        for (int i = 0; i < tamanho ; i++) {
          empty += builder[j];
          j--;
        }
        return empty;
    }

    public static boolean checkIfPalindrome(String str){
        if(str == null)
            return false;

        return str.equals(reverseString(str));
    }
}