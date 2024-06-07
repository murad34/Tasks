package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        while (true) {

            try {

                int number = scanner.nextInt();

                System.out.println(String.valueOf(number).length());

            } catch (Exception e) {

                System.out.println("ERROR !");

                break;
            }

        }

    }

}