package ExamExcercises;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget=Double.parseDouble(sc.nextLine());
        String destination= sc.nextLine();
        String season= sc.nextLine();
        int days=Integer.parseInt(sc.nextLine());
        double totalcost=0;
        switch (destination){
            case "Dubai":
                if (season.equals("Winter")){
                    totalcost=days*45000*0.7;
                }else {
                    totalcost=days*40000*0.7;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")){
                    totalcost=days*17000*1.25;
                }else {
                    totalcost=days*12500*1.25;
                }
                break;

            case "London":
                if (season.equals("Winter")){
                    totalcost=days*24000;
                }else {
                    totalcost=days*20250;
                }
                break;
        }

    if (budget>=totalcost){
        System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budget-totalcost);
    }else {
        System.out.printf("The director needs %.2f leva more!",totalcost-budget);
    }
    }
}
