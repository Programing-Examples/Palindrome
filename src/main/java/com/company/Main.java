package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word: ");
        String word = scanner.nextLine();

        if (isAPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }


    }

    protected static boolean isAPalindrome(String word) {
        boolean isPalindrome = true;
        
        String cleanStr = removeNoLetterCharacters(word);
        cleanStr = cleanStr.toLowerCase();

        for (int i = 0, j=cleanStr.length() -1; i < j; i++, j--) {
            if (cleanStr.charAt(i) != cleanStr.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    private static String removeNoLetterCharacters(String word) {
        return word.replaceAll("[\\s?,!.]*","");
    }
}
