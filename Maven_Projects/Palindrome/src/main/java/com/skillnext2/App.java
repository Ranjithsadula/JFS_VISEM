package com.skillnext2;
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String input = sc.nextLine();
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
        sc.close();
    }
}
