package ConditionalStatementsAdvanced.MoreExcercises;

import java.util.Scanner;

public class MathTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget=Double.parseDouble(sc.nextLine());
        String kind= sc.nextLine();
        int people=Integer.parseInt(sc.nextLine());
        double transport=0;
        double ticketsCost=0;
        if (people<=4){
            transport=budget*0.75;
        }else if (people<=9){
            transport=budget*0.6;
        }else if (people<24){
            transport=budget*0.5;
        }else if (people<=49){
            transport=budget*0.4;
        }else {
            transport = budget * 0.25;
        }
        if (kind.equals("Normal")){
            ticketsCost=people*249.99;
        }else if (kind.equals("VIP")){
            ticketsCost=people*499.99;
        }
        double totalCost=ticketsCost+transport;

        if (totalCost<=budget){
            System.out.printf("Yes! You have %.2f leva left.",budget-totalCost);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",totalCost-budget);
        }

    }
}