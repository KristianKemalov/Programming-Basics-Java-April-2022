package ConditionalStatementsAdvanced.Excercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String rate = sc.nextLine();

        int nights = days - 1;
        double price = 0;

        if (nights < 10) {
            if (room.equals("room for one person")) {
                price = nights * 18;
            } else if (room.equals("apartment")) {
                price = (nights * 25) * 0.7;
            } else if (room.equals("president apartment"))
                price = (nights * 35) * 0.9;
        } else if (nights < 15) {
            if (room.equals("room for one person")) {
                price = nights * 18;
            } else if (room.equals("apartment")) {
                price = (nights * 25) * 0.65;
            } else if (room.equals("president apartment"))
                price = (nights * 35) * 0.85;

        } else {
            if (room.equals("room for one person")) {
                price = nights * 18;
            } else if (room.equals("apartment")) {
                price = (nights * 25) * 0.5;
            } else if (room.equals("president apartment"))
                price = (nights * 35) * 0.8;
        }
        if (rate.equals("positive")){
            price=price*1.25;
            System.out.printf("%.2f",price);
        }else {
            price = price *0.9;
            System.out.printf("%.2f", price);
        }



    }
}
