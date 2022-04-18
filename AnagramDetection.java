package com.day16_and_day17;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second String : ");
        String s2 = scanner.nextLine();

        if(checkAnagram(s1, s2))
            System.out.println(s1+" and "+s2+" the two strings are Anagrams");
        else
            System.out.println(s1+" and "+s2+" the two are NOT Anagrams");
        scanner.close();
    }

    public static boolean checkAnagram(String s1, String s2)  {

        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");

        if(s1.length() != s2.length())
            return false;
        else  {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return (Arrays.equals(arr1, arr2));
        }
    }
}
