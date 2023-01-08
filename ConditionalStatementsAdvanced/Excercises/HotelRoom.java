package ConditionalStatementsAdvanced.Excercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());
        double priceStudio = 0;
        double priceApartament = 0;


        switch (month) {
            case "May":
            case "October":
                priceApartament = nights * 65;
                priceStudio = nights * 50;
                break;
            case "June":
            case "September":
                priceApartament = nights * 68.70;
                priceStudio = nights * 75.20;
                break;
            case "July":
            case "August":
                priceApartament=nights*77;
                priceStudio=nights*76;
                break;

        }
        if (nights>14){
            priceApartament=priceApartament*0.9;
        }
        if (nights>7&&nights<14&&(month.equals("May")||month.equals("October"))){
            priceStudio=priceStudio*0.95;
        }else if (nights>14&&(month.equals("May")||month.equals("October"))){
            priceStudio=priceStudio*0.7;
        }else if (nights>14&&(month.equals("June")||month.equals("September"))){
            priceStudio=priceStudio*0.8;
        }

        System.out.printf("Apartment: %.2f lv.%n",priceApartament);
        System.out.printf("Studio: %.2f lv.",priceStudio);



        }
}
