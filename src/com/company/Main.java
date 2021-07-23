package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your numbers a and b for squareroot: ");
        Squareroot squareroot = new Squareroot();
        System.out.println("Squareroot for this numbers is: " + squareroot.operation(sc.nextInt(), sc.nextInt()));

        System.out.print("Enter your numbers a and b for multiplication: ");
        Multiplication mlt = new Multiplication();
        System.out.println("Multiplication for this numbers is: " + mlt.operation(sc.nextInt(), sc.nextInt()));

        System.out.print("Enter your numbers a and b for square: ");
        Square square = new Square();
        System.out.println("Square for this numbers is: " + square.operation(sc.nextInt(), sc.nextInt()));

        System.out.print("Enter your numbers a and b for division: ");
        Division div = new Division();
        System.out.println("Division for this numbers is: " + div.operation(sc.nextInt(), sc.nextInt()));

        System.out.print("Enter your numbers a and b for subtract: ");
        Subtract sub = new Subtract();
        System.out.println("Subtract for this numbers is: " + sub.operation(sc.nextInt(), sc.nextInt()));

        System.out.println("Enter your numbers a and b for add: ");
        Add add = new Add();
        System.out.println("Add for this numbers is: " + add.operation(sc.nextInt(), sc.nextInt()));




    }
}
