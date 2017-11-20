package main.java.com.company;

public class Main {

    public static void main(String[] args) {
        char[] word = {'d','r','a','w','k','w','a','r','d'}; //Dr. Awkward

        for (int i = 0, j=word.length -1; i < j; i++, j--) {
            if (word[i] != word[j]) {
                System.out.println("Dr Awkward is not a palindrome");
            }
        }
        System.out.println("Dr Awkward is a palindrome");

    }
}
