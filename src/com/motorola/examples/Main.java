package com.motorola.examples;

import java.util.Scanner;

import com.motorola.examples.arraymultidimensionais.bidimencionais.ArrayExamples;
import com.motorola.examples.byt.BytExamples;
import com.motorola.examples.queue.QueueExamples;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nChoose an example to run:");
                System.out.println("1. Loop with Return");
                System.out.println("2. Vehicle Range");
                System.out.println("3. Even Number Check");
                System.out.println("4. Array Initialization");
                System.out.println("5. Multidimensional Arrays");
                System.out.println("6. Bitwise Operations");
                System.out.println("7. Queue");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        new LoopWithReturn().myMeth();
                        break;
                    case 2:
                        VehicleRange.main(args);
                        break;
                    case 3:
                        EvenNumberCheck.main(args);
                        break;
                    case 4:
                        ArrayInitialization.main(args);
                        break;
                    case 5:
                        ArrayExamples.main(args);
                        break;
                    case 6:
                        BytExamples.main(args);
                        break;
                    case 7:
                        QueueExamples.main(args);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
