package ForLoop.MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tovari = Integer.parseInt(sc.nextLine());
        int totalkg = 0;
        int kgmicrobus = 0;
        int kgtruck = 0;
        int kgtrain = 0;
        double price = 0;

        for (int i = 1; i <= tovari; i++) {
            int kg = Integer.parseInt(sc.nextLine());
            totalkg += kg;
            if (kg <= 3) {
                kgmicrobus += kg;
                price += 200 * kg;
            } else if (kg <= 11) {
                kgtruck += kg;
                price += 175 * kg;
            } else {
                kgtrain += kg;
                price += 120 * kg;
            }
        }
        System.out.printf("%.2f%n", price / totalkg);
        System.out.printf("%.2f%%%n", kgmicrobus * 1.00 / totalkg * 100);
        System.out.printf("%.2f%%%n", kgtruck * 1.00 / totalkg * 100);
        System.out.printf("%.2f%%", kgtrain * 1.00 / totalkg * 100);
    }
}
