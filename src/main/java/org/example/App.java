package org.example;


import java.util.Scanner;

/*
 Answers to the bracket sequence questions:
 1. Can the sequence [((())()(())]] be considered correct?
    No, the sequence is not correct because the brackets are not balanced.
 2. What needs to be changed to make it correct?
    To make it correct, remove the extra closing square bracket `]` at the end
    and ensure all brackets are properly closed. The corrected sequence is: [((())()(()))]
*/

public class App

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNum = scanner.nextInt();

        if(inputNum>7) {
            System.out.println("Hello");
        }

        System.out.print("Enter a name: ");
        scanner.nextLine(); // Consume the newline character
        String name = scanner.nextLine();
        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array that are multiples of 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
        scanner.close();
    }
}

