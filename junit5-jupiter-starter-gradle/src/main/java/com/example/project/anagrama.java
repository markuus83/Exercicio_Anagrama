package com.example.project;

import java.util.Scanner;
import java.util.Arrays;

public class anagrama {

    public static boolean areAnagrams(String str1, String str2) {
    	
        if (str1 == null || str2 == null || str1.length() != str2.length())
        	
            return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
    	
        String str1 = getUserInput("Enter first String value: ");
        String str2 = getUserInput("Enter second String value: ");

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
            
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    private static String getUserInput(String prompt) {
    	
        System.out.print(prompt);
        try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}
    }
}
