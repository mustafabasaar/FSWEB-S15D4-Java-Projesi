package com.workintech;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Decimal bir sayı girin: ");
        int decimalNumber = scanner.nextInt();

        String binaryRepresentation = convertToBinary(decimalNumber);

        System.out.println("Binary karşılığı: " + binaryRepresentation);
    }

    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        Stack<Integer> binaryStack = new Stack<>();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryStack.add(remainder);

            decimalNumber /= 2;
        }

        StringBuilder binary = new StringBuilder();


        while (!binaryStack.isEmpty()) {
            binary.append(binaryStack.pop());
        }

        return binary.toString();
    }
}
