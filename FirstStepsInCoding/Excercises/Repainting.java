package FirstStepsInCoding.Excercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Входът се чете от конзолата и съдържа точно 4 реда:
        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
        int naylon=Integer.parseInt(scanner.nextLine());
        int paint=Integer.parseInt(scanner.nextLine());
        int thinner=Integer.parseInt(scanner.nextLine());
        int hours=Integer.parseInt(scanner.nextLine());
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър
        //+10% paint  i  0.40 torbichka
        //заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.

        double pricenaylon=(naylon+2)*1.5;
        double pricepaint=(paint+paint*10/100.00)*14.5;
        double pricethinner=thinner*5.00;
        double totalprice=pricenaylon+pricepaint+pricethinner+0.4;
        double pricework=(totalprice*30/100)*hours;
        double finalprice=totalprice+pricework;
        System.out.println(finalprice);



    }

}
