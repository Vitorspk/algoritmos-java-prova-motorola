package com.motorola.examples.queue;

import java.util.Scanner;

public class QueueExamples {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nChoose an example to run:");
                System.out.println("1. Simple Queue");
                System.out.println("0. Back to main menu");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        SimpleQueue.main(args);
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
