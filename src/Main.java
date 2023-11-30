import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
        System.out.println("***************************");



        System.out.println(checkForPalindrome( "Racecar")); // true


        System.out.println(checkForPalindrome("hello"));


        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }

    public static boolean checkForPalindrome(String text) {
        text = text.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length() / 2; i++) {
            stack.push(text.charAt(i));
        }

        int startIndex = (text.length() + 1) / 2;
        for (int i = startIndex; i < text.length(); i++) {
            if (stack.isEmpty() || stack.pop() != text.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    }
