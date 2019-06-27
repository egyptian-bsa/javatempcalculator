package com.bsa.meritbadge;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Fahrenheit temperature and press enter.");
        int fTemp = scanner.nextInt();
        double cTemp = (5.0 / 9.0) * (fTemp - 32.0);
        System.out.println("It is " + cTemp + " degrees in Celsius.");
        if (fTemp > 100) {
            System.out.println("It's Hot! Better Hydrate");
        } else if (fTemp <= 32) {
            System.out.println("It's Cold! Better pack long underwear!");
        }
    }
}
