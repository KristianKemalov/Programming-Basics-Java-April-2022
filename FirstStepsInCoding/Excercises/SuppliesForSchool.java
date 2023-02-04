package FirstStepsInCoding.Excercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)
        //От конзолата се четат 4 числа:
        //•	Брой пакети химикали - цяло число в интервала [0...100]
        //•	Брой пакети маркери - цяло число в интервала [0...100]
        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //•	Процент намаление - цяло число в интервала [0...100]
        //Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.
            int pens=Integer.parseInt(scanner.nextLine());
            int markers=Integer.parseInt(scanner.nextLine());
            int litres=Integer.parseInt(scanner.nextLine());
            int discount=Integer.parseInt(scanner.nextLine());
            double price=pens*5.8+markers*7.20+litres*1.20;
            double finalprice=price-(price*discount/100);
        System.out.println(finalprice);
    }
}
