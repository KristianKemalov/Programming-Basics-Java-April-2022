package ForLoop.Excercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        double washingPrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());
        int evenBirth = 0;
        double money = 0;
        int toysTotal = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                evenBirth++;
                money = (money + evenBirth * 10) - 1;
            } else {
                toysTotal += toyPrice;
            }

        }
        double moneySaved = money + toysTotal;
        if (moneySaved >= washingPrice) {
            System.out.printf("Yes! %.2f", moneySaved - washingPrice);
        } else
            System.out.printf("No! %.2f", washingPrice - moneySaved);


    }
}
