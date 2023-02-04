package ExamExcercises2;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target=Integer.parseInt(sc.nextLine());
        double totalIncome=0;

        String input= sc.nextLine();
        while (!input.equals("closed")){
            String operation= input;
            if (operation.equals("haircut")){
                String kind= sc.nextLine();
                if (kind.equals("mens")){
                    totalIncome+=15;
                }else if (kind.equals("ladies")){
                    totalIncome+=20;
                }else if (kind.equals("kids")){
                    totalIncome+=10;
                }
            }else if (operation.equals("color")) {
                String what = sc.nextLine();
                if (what.equals("touch up")){
                    totalIncome+=20;
                }else if (what.equals("full color")){
                    totalIncome+=30;
                }
            }


            if (totalIncome>=target){
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %.0flv.",totalIncome);
                break;
            }


            input= sc.nextLine();
        }



        if (totalIncome<target){
            System.out.printf("Target not reached! You need %.0flv. more.%n",target-totalIncome);
            System.out.printf("Earned money: %.0flv.",totalIncome);
        }



    }
}
