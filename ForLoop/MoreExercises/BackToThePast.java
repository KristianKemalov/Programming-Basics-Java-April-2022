package ForLoop.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneygifted = Double.parseDouble(sc.nextLine());
        int yearmustlive = Integer.parseInt(sc.nextLine());
        double moneyspent = 0;
        int age = 17;

        for (int i = 1800; i <= yearmustlive; i++) {
            age++;
            if (i % 2 == 0) {
                moneygifted-=12000;
            } else {
                moneygifted -= 12000 + 50 * age;
            }
        }
        if (0 <= moneygifted) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneygifted - moneyspent);
        }else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(moneygifted));
        }


    }
}
