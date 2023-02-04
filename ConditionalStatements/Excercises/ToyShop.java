package ConditionalStatements.Excercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.
        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена
        //От спечелените пари Петя трябва да даде 10% за наема на магазина
        double tripPrice = Double.parseDouble(sc.nextLine());
        int puzzels = Integer.parseInt(sc.nextLine());
        int dolls = Integer.parseInt(sc.nextLine());
        int bears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());
        int totalToys = puzzels + dolls + minions + trucks + bears;
        double totalPrice = puzzels * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        if (totalToys >= 50) {
            totalPrice = totalPrice * 0.75;

        }
        totalPrice = totalPrice * 0.9;

        if (totalPrice >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(totalPrice-tripPrice));
        }


    }
}
