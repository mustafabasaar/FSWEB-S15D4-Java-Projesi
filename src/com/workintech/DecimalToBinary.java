package com.workintech;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {


    public static void main(String[] args) {
         LinkedList<String> results = new LinkedList<>();



        String binaryRepresentation = convertToBinary(12);
        String binaryRepresentation2 = convertToBinary(222);
        String binaryRepresentation3= convertToBinary(232322);
        String binaryRepresentation4 = convertToBinary(323232);

        results.add(binaryRepresentation2);
        results.add(binaryRepresentation3);
        results.add(binaryRepresentation4);
        results.add(binaryRepresentation);
        results.add(binaryRepresentation);
        System.out.println("results: "+results );

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
