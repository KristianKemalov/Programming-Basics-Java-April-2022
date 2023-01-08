package ConditionalStatementsAdvanced.Excercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int flowers = Integer.parseInt(sc.nextLine());
        int money = Integer.parseInt(sc.nextLine());
        double totalPrice = 0.0;

        switch (type) {
            case "Roses":
                if (flowers > 80) {
                    totalPrice = (flowers * 5) * 0.9;
                } else totalPrice = flowers * 5;
                break;
            case "Dahlias":
                if (flowers>90){
                    totalPrice=(flowers*3.8)*0.85;
                }else totalPrice=flowers*3.8;
                break;
            case "Tulips":
                if (flowers>80){
                    totalPrice=(flowers*2.8)*0.85;
                }else totalPrice=flowers*2.8;
                break;
            case "Narcissus":
                if (flowers<120){
                    totalPrice=flowers*3.45;
                }else totalPrice=flowers*3;
                break;
            case"Gladiolus":
                if (flowers<80){
                    totalPrice=flowers*3;
                }else totalPrice=flowers*2.5;
                break;
        }if (money>=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowers,type,money-totalPrice);
        }else System.out.printf("Not enough money, you need %.2f leva more.",totalPrice-money);
    }
}
