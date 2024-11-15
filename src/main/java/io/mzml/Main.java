package io.mzml;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        String input = System.console().readLine("Enter your name.\n\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println(input);
        }
    }
}