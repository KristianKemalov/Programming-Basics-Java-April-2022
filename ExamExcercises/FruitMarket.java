package ExamExcercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double strawberryPrice=Double.parseDouble(sc.nextLine());
        double bananasKg=Double.parseDouble(sc.nextLine());
        double orangeKg=Double.parseDouble(sc.nextLine());
        double raspberryKg=Double.parseDouble(sc.nextLine());
        double strawberryKg=Double.parseDouble(sc.nextLine());
        double raspberryPrice=strawberryPrice*0.5;
        double orangePrice=raspberryPrice*0.6;
        double bananasPrice=raspberryPrice*0.2;
        double total=bananasPrice*bananasKg+raspberryPrice*raspberryKg+strawberryKg*strawberryPrice+orangePrice*orangeKg;
        System.out.printf("%.2f",total);

    }
}
