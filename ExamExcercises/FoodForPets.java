package ExamExcercises;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        double food = Double.parseDouble(sc.nextLine());
        double dogfood = 0;
        double catfood = 0;
        double biscuits = 0;
        double totalfood = 0;

        for (int i = 1; i <= days; i++) {
            int dogeat = Integer.parseInt(sc.nextLine());
            int cateat = Integer.parseInt(sc.nextLine());
            totalfood += dogeat + cateat;
            dogfood += dogeat;
            catfood += cateat;

            if (i % 3 == 0) {
                biscuits += 0.1 * (dogeat + cateat);
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalfood / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", dogfood / totalfood * 100);
        System.out.printf("%.2f%% eaten from the cat.", catfood / totalfood * 100);
    }
}
