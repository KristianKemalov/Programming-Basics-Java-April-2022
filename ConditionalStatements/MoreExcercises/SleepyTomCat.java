package ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysOff=Integer.parseInt(sc.nextLine());
        int workDays=365-daysOff;
        int playtime=(daysOff*127)+(workDays*63);
        int result=Math.abs(30000-playtime);
        int hours=result/60;
        int min=result%60;


        if (playtime>30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hours,min);
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,min);
        }





    }
}
