package ForLoop.Excercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tournaments=Integer.parseInt(sc.nextLine());
        int startPoints=Integer.parseInt(sc.nextLine());
        int tournaPoints=0;
        int wins=0;
        for (int i = 1; i <=tournaments ; i++) {
            String kind= sc.nextLine();
            if (kind.equals("W")){
                wins++;
                tournaPoints+=2000;
            }else if (kind.equals("F")){
                tournaPoints+=1200;
            }else if (kind.equals("SF")){
                tournaPoints+=720;
            }
        }
        System.out.printf("Final points: %d%n",tournaPoints+startPoints);
        System.out.printf("Average points: %.0f%n",Math.ceil(tournaPoints/tournaments));
        System.out.printf("%.2f%%%n",wins*1.00/tournaments*100);






    }
}
