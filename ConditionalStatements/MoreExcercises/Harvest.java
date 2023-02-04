package ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area=Integer.parseInt(sc.nextLine());
        double grapePerMeter=Double.parseDouble(sc.nextLine());
        int needWineLiters=Integer.parseInt(sc.nextLine());
        int workers=Integer.parseInt(sc.nextLine());
        //заделя 40% от реколтата за производство на вино
        //От 1 кв.м лозе се изкарват Y килограма грозде
        //За 1 литър вино са нужни 2,5 кг. грозде
        //Желаното количество вино за продан е Z литра
        double wineHarv=area*0.4;
        double grapeKg=wineHarv*grapePerMeter;
        double wineLiters=grapeKg/2.5;

        if (needWineLiters > wineLiters) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(needWineLiters-wineLiters));
        }else{
            double wineleft=wineLiters-needWineLiters;
            double wineperwork=wineleft/workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(wineLiters));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wineleft),Math.ceil(wineperwork));

        }






    }
}
