package FirstStepsInCoding.Excercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.
        //Вход
        //От конзолата се четат 3 реда:
        //•	Брой пилешки менюта – цяло число в интервала [0 … 99]
        //•	Брой менюта с риба – цяло число в интервала [0 … 99]
        //•	Брой вегетариански менюта – цяло число в интервала [0 … 99]
        int chicken=Integer.parseInt(scanner.nextLine());
        int fish=Integer.parseInt(scanner.nextLine());
        int vegan=Integer.parseInt(scanner.nextLine());

        double cost = chicken*10.35+fish*12.4+vegan*8.15;
        double desert=cost*0.2;
        double totalcost=cost+desert+2.5;
        System.out.println(totalcost);
    }
}
