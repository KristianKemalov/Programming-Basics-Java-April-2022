package ConditionalStatements.Excercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        int episodeTime=Integer.parseInt(sc.nextLine());
        int restTime=Integer.parseInt(sc.nextLine());
        double lunchTime=restTime/8.00;
        double otixTime=restTime/4.00;
        double freeTime=restTime-(lunchTime+otixTime);

        if (freeTime >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name,Math.ceil(freeTime-episodeTime));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",name,Math.ceil(episodeTime-freeTime));
        }






    }
}
