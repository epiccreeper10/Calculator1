package edu.neumont.math;

import java.util.Scanner;

public class Main {
static boolean loop = true;
static Console console = new Console();

    public static void main(String[] args) {
        while (loop == true) {
            console.console();
            System.out.println("Choose 1 or 2 or 3 or 4 or 5:");

            System.out.println("1: conversion from base 2 to base 10");

            System.out.println("2: conversion from base 8 to base 10");

            System.out.println("3: conversion from base 10 to all bases");

            System.out.println("4: conversion from base 16 to base 10");

            System.out.println("5: exit program");
            // do you want 1, 2 , or 3? you have your choice
            Scanner in = new Scanner(System.in);
            Maths2 maths2 = new Maths2();
            int choice = in.nextInt();
            console.consoleLog();
            if (choice == 1) {
                maths2.main2();
            }
            if (choice == 2) {
                maths2.main3();
            }
            if (choice == 3) {
                Maths2.main();
            }
            if (choice == 4) {
                maths2.main4();
            } if (choice == 5) {
                loop = false;
            }
        }
    }
}
