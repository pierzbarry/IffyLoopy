package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean redEyes;
        String no = "n";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Are your eyes red?");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                redEyes = true;
                System.out.println("Go to sleep you idiot");
            } else {
                redEyes = false;
                System.out.println("You look alright I guess?");
            }
            System.out.println("Do you want to try again? (y/n)");
            no = scan.next();
        } while (no.equalsIgnoreCase("y") || no.equalsIgnoreCase("yes"));
    }
}
