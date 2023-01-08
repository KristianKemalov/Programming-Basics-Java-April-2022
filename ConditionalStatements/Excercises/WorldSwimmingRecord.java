package ConditionalStatements.Excercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double record=Double.parseDouble(sc.nextLine());
        double metres=Double.parseDouble(sc.nextLine());
        double time1meter=Double.parseDouble(sc.nextLine());
        double ivanTime=metres*time1meter;
        double delay=Math.floor(metres/15)*12.5;
        ivanTime=ivanTime+delay;

        if (ivanTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivanTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",ivanTime-record);
        }







    }
}
