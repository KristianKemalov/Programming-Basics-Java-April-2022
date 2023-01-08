package ConditionalStatements.Excercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget=Double.parseDouble(sc.nextLine());
        int videoCards=Integer.parseInt(sc.nextLine());
        int procesors=Integer.parseInt(sc.nextLine());
        int ram=Integer.parseInt(sc.nextLine());
        double videoPrice=videoCards*250;
        double procesorsPrice=(videoPrice*0.35)*procesors;
        double ramPrice=(videoPrice*0.1)*ram;
        double totalPrice=ramPrice+videoPrice+procesorsPrice;
        if (videoCards > procesors) {
            totalPrice=totalPrice*0.85;
        }
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!",budget-totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(budget-totalPrice));
        }









    }
}
