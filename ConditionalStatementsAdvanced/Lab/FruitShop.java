package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        String day = sc.nextLine();
        double amount = Double.parseDouble(sc.nextLine());
        double price = 0;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (type) {
                case "banana":
                    price = amount * 2.5;
                    System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = amount * 1.2;
                    System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = amount * 0.85;
                    System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = amount * 1.45;
                    System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = amount * 2.7;
                    System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = amount * 5.5;
                    System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = amount * 3.85;
                    System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (type) {
                case "banana":
                    price = amount * 2.7;
                    System.out.printf("%.2f",price);
                    break;
                case "apple":
                    price = amount * 1.25;
                    System.out.printf("%.2f",price);
                    break;
                case "orange":
                    price = amount * 0.90;
                    System.out.printf("%.2f",price);
                    break;
                case "grapefruit":
                    price = amount * 1.60;
                    System.out.printf("%.2f",price);
                    break;
                case "kiwi":
                    price = amount * 3;
                    System.out.printf("%.2f",price);
                    break;
                case "pineapple":
                    price = amount * 5.6;
                    System.out.printf("%.2f",price);
                    break;
                case "grapes":
                    price = amount * 4.20;
                    System.out.printf("%.2f",price);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        } else {
            System.out.println("error");

        }
    }
}