package ConditionalStatementsAdvanced.MoreExcercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String type;
        String location;
        double price = 0;
        if (budget <= 1000) {
            type = "Camp";
            if (season.equals("Winter")) {
                price = budget * 0.45;
                location = "Morocco";
            } else {
                location = "Alaska";
                price = budget * 0.65;
            }

        } else if (budget <= 3000) {
            type = "Hut";
            if (season.equals("Winter")) {
                price = budget * 0.6;
                location = "Morocco";
            } else {
                location = "Alaska";
                price = budget * 0.8;
            }
        } else {
            type = "Hotel";
            price = budget * 0.9;
            if (season.equals("Winter")) {
                location = "Morocco";
            } else {
                location = "Alaska";

            }
        }

        System.out.printf("%s - %s - %.2f",location,type,price);
    }
}
