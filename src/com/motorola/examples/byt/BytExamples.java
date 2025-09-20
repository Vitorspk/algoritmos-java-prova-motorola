package com.motorola.examples.byt;

import java.util.Scanner;

public class BytExamples {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nChoose an example to run:");
                System.out.println("1. Uppercase to Lowercase");
                System.out.println("2. Show Bits");
                System.out.println("3. Encode/Decode");
                System.out.println("0. Back to main menu");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Upcase.main(args);
                        break;
                    case 2:
                        ShowBits.main(args);
                        break;
                    case 3:
                        EncodeDecode.main(args);
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
