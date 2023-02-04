package ConditionalStatementsAdvanced.MoreExcercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season= sc.nextLine();
        double km=Double.parseDouble(sc.nextLine());
        double money=0;


        switch (season){
            case"Spring":
            case "Autumn":
                if (km<=5000){
                    money=km*0.75*4;
                }else if (km<=10000){
                    money=km*0.95*4;
                }else {
                    money=km*1.45*4;
                }
                break;
            case "Summer":
                if (km<=5000){
                    money=km*0.9*4;
                }else if (km<=10000){
                    money=km*1.10*4;
                }else {
                    money=km*1.45*4;
                }
                break;
            case "Winter":
                if (km<=5000){
                    money=km*1.05*4;
                }else if (km<=10000){
                    money=km*1.25*4;
                }else {
                    money=km*1.45*4;
                }
                break;


        }

        money=money*0.9;
        System.out.printf("%.2f",money);


    }
}
