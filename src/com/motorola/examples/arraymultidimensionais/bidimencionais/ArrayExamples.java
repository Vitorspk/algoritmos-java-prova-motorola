package com.motorola.examples.arraymultidimensionais.bidimencionais;

import java.util.Scanner;

public class ArrayExamples {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nChoose an example to run:");
                System.out.println("1. Two Dimensional Array");
                System.out.println("2. Jagged Array");
                System.out.println("3. Array Reference");
                System.out.println("4. Custom Vector");
                System.out.println("0. Back to main menu");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        TwoDimensionalArray.main(args);
                        break;
                    case 2:
                        JaggedArray.main(args);
                        break;
                    case 3:
                        ArrayReference.main(args);
                        break;
                    case 4:
                        VetoresTeste.main(args);
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
