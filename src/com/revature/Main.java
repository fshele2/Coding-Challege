package com.revature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minute:");
        x = sc.nextInt();
        System.out.println("That is " + x * 60 + " seconds.");



    }
}