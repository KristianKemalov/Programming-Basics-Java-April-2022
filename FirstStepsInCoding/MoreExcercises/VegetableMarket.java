package FirstStepsInCoding.MoreExcercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //•	 Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        // Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	 Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	– Общо килограми на плодовете – цяло число[0… 1000]
        double vegprice = Double.parseDouble(sc.nextLine());
        double fruitprice = Double.parseDouble(sc.nextLine());
        int kgvg=Integer.parseInt(sc.nextLine());
        int kgfr=Integer.parseInt(sc.nextLine());
        double price1=vegprice*kgvg;
        double price2=fruitprice*kgfr;
        double total=(price1+price2)/1.94;


        System.out.printf("%.2f",total);





    }
}
