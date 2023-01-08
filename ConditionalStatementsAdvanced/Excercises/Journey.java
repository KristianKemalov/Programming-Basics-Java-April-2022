package ConditionalStatementsAdvanced.Excercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        double result = 0;

        if (budget <= 100) {
            if (season.equals("summer")||season.equals("Summer")) {
                result = budget * 0.3;
                System.out.printf("Somewhere in Bulgaria%n");
                System.out.printf("Camp - %.2f", result);
            } else if (season.equals("winter")||season.equals("Winter")) {
                result = budget * 0.7;
                System.out.printf("Somewhere in Bulgaria%n");
                System.out.printf("Hotel - %.2f", result);
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")||season.equals("Summer")) {
                result = budget * 0.4;
                System.out.printf("Somewhere in Balkans%n");
                System.out.printf("Camp - %.2f", result);
            } else if (season.equals("winter")||season.equals("Winter")) {
                result = budget * 0.8;
                System.out.printf("Somewhere in Balkans%n");
                System.out.printf("Hotel - %.2f", result);
            }
        } else if (budget > 1000) {
            result = budget * 0.9;
            System.out.printf("Somewhere in Europe%n");
            System.out.printf("Hotel - %.2f",(result));
        }


    }
}
