package ConditionalStatementsAdvanced.MoreExcercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        double price=0;
        String type;
        String car = null;
        if (budget<=100){
             type="Economy class";
            if (season.equals("Summer")){
                 car="Cabrio";
                 price=budget*0.35;
            }else if (season.equals("Winter")) {
                 car = "Jeep";
                price = budget * 0.65;
            }
        }else if (budget<=500){
             type="Compact class";
            if (season.equals("Summer")){
                 car="Cabrio";
                price=budget*0.45;
            }else if (season.equals("Winter")){
                 car="Jeep";
                price=budget*0.8;
            }
        }else{
             type="Luxury class";
             car="Jeep";
             price=budget*0.9;}

        System.out.println(type);
        System.out.printf("%s - %.2f",car,price);







    }
}
