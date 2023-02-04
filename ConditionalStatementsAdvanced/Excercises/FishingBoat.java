package ConditionalStatementsAdvanced.Excercises;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget=Integer.parseInt(sc.nextLine());
        String season= sc.nextLine();
        int fishmen=Integer.parseInt(sc.nextLine());
        double price=0;

        switch (season){
            case "Spring":
                if (fishmen<=6){
                    price=3000*0.9;
                }else if (fishmen<=11){
                    price=3000*0.85;
                }else price=3000*0.75;
                break;
            case "Autumn":
            case "Summer":
                if (fishmen<=6){
                    price=4200*0.9;
                }else if (fishmen<=11){
                    price=4200*0.85;
                }else price=4200*0.75;
                break;
            case "Winter":
                if (fishmen<=6){
                    price=2600*0.9;
                }else if (fishmen<=11){
                    price=2600*0.85;
                }else price=2600*0.75;
                break;
        }

        if (!season.equals("Autumn")&&fishmen%2==0){
            price=price*0.95;
        }
        if (budget>=price){
            System.out.printf("Yes! You have %.2f leva left.",budget-price);
        }else System.out.printf("Not enough money! You need %.2f leva.",price-budget);





















    }
}
