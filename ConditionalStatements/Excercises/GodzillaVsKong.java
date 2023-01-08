package ConditionalStatements.Excercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double clothesPrice = Double.parseDouble(sc.nextLine());

        double decorCost=budget*0.1;
        double statCost=clothesPrice*statists;

        if (statists >= 150) {
            statCost=statCost*0.9;
        }
        double totalCost=statCost+decorCost;
        if (budget >= totalCost) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-totalCost);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(budget-totalCost));
        }



    }
}
