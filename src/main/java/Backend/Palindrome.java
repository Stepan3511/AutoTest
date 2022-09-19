package Backend;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();

        String input = "a RoZa upala na laPu aZora";

        if (palindrome.isPalindrome(input))
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is not a palindrome.");
    }
    boolean isPalindrome(String input) {

        input = input.toLowerCase().replaceAll("\\s+", "");

        int length = input.length();

        if (!input.matches("^([a-z0-9]+)?$")) {
            return false;
        }
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
