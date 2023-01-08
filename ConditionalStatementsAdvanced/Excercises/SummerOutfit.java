package ConditionalStatementsAdvanced.Excercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degrees = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        if (degrees >= 10 && degrees <= 18) {
            switch (type) {
                case "Morning":
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
                    break;
                case "Afternoon":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                    break;
                case "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                    break;
            }
        }else if (degrees>18&&degrees<=24) {
            switch (type) {
                case "Morning":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                    break;
                case "Afternoon":
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                    break;
                case "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                    break;

            }
        }else if (degrees>=25) {
            switch (type) {
                case "Morning":
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                    break;
                case "Afternoon":
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degrees);
                    break;
                case "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                    break;


            }
        }
    }
}
