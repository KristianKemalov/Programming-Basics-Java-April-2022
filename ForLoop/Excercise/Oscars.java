package ForLoop.Excercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double points = Double.parseDouble(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        double totalPoints = 0+points;


        for (int i = 1; i <= n; i++) {
            if (totalPoints < 1250.5) {
                String nameReporter = sc.nextLine();
                double pointsReporter = Double.parseDouble(sc.nextLine());
                totalPoints = totalPoints + pointsReporter * nameReporter.length() / 2;
            }
        }

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
        }else
            System.out.printf("Sorry, %s you need %.1f more!",name,1250.5-totalPoints);
    }
}