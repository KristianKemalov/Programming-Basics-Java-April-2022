package NestedLoop.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();
        while (!input.equals("End")) {
            double budget = Double.parseDouble(sc.nextLine());
            double sum = 0;
            while (sum < budget) {
                double saves = Double.parseDouble(sc.nextLine());
                sum += saves;
            }
            System.out.printf("Going to %s!%n", input);

            input = sc.nextLine();
        }
    }
}
