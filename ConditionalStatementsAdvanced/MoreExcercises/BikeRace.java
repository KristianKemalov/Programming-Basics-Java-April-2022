package ConditionalStatementsAdvanced.MoreExcercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juniors=Integer.parseInt(sc.nextLine());
        int seniors=Integer.parseInt(sc.nextLine());
        String trace= sc.nextLine();
        double charityMoney=0;
        double seniorsMoney=0;
        double juniorsMoney=0;
        int people=seniors+juniors;
        switch (trace){
            case "trail":
                seniorsMoney=seniors*7;
                juniorsMoney=juniors*5.5;
                break;
            case "cross-country":
                seniorsMoney=seniors*9.5;
                juniorsMoney=juniors*8;
                break;
            case"downhill":
                seniorsMoney=seniors*13.75;
                juniorsMoney=juniors*12.25;
                break;
            case "road":
                seniorsMoney=seniors*21.5;
                juniorsMoney=juniors*20;
                break;
        }
        charityMoney=seniorsMoney+juniorsMoney;
        if (trace.equals("cross-country")&&people>=50){
            charityMoney=charityMoney*0.75;
        }

        charityMoney=charityMoney*0.95;

        System.out.printf("%.2f",charityMoney);





    }
}
