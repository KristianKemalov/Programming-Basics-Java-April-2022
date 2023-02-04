package ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double litres = Double.parseDouble(sc.nextLine());
        String card = sc.nextLine();
        double totalPrice = 0;

        switch (type) {
            case "Gas":
                if (card.equals("Yes")) {
                    totalPrice = litres * 0.85;
                } else if (card.equals("No")) {
                    totalPrice = litres * 0.93;
                }
                break;
            case "Gasoline":
                if (card.equals("Yes")) {
                    totalPrice = litres * 2.04;
                } else if (card.equals("No")) {
                    totalPrice = litres * 2.22;
                }
                break;
            case "Diesel":
                if (card.equals("Yes")) {
                    totalPrice = litres * 2.21;
                } else if (card.equals("No")) {
                    totalPrice = litres * 2.33;
                }
                break;
        }

        if (litres > 20 && litres <= 25) {
            totalPrice=totalPrice*0.92;
        }else if (litres>25){
            totalPrice=totalPrice*0.9;
        }
        System.out.printf("%.2f lv.",totalPrice);


    }
    }
