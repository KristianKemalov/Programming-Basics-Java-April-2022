package WhileLoop.Excercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double change = Double.parseDouble(sc.nextLine());
        double coins = change * 100;
        int coincounter = 0;
        while (coins != 0) {
            if (coins >= 200) {
                coins -= 200;
                coincounter++;
            } else if (coins >= 100) {
                coins -= 100;
                coincounter++;
            } else if (coins >= 50) {
                coins -= 50;
                coincounter++;
            } else if (coins >= 20) {
                coins -= 20;
                coincounter++;
            } else if (coins >= 10) {
                coins -= 10;
                coincounter++;
            } else if (coins >= 5) {
                coins -= 5;
                coincounter++;
            } else if (coins >= 2) {
                coins -= 2;
                coincounter++;
            } else if (coins >= 1) {
                coins -= 1;
                coincounter++;
            } else {
                break;
            }
        }
            System.out.println(coincounter);
    }
}